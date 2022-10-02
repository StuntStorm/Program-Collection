const request = require('request');

const Discord = require('discord.js');
const client = new Discord.Client();

const TOKEN = process.env.TOKEN;

if (!process.env.TOKEN) {
    console.error("Must pass TOKEN as an environment variable!");
    process.exit();
}

const low = require('lowdb');
const { serialize } = require('lowdb/adapters/FileSync');
const db = low(new (require('lowdb/adapters/FileSync'))(__dirname + '/db.json'));

db.defaults({channels: {}}).write();

client.on('ready', () => {
    console.log(`Hey, it's ya boiiii ${client.user.tag}`);
    client.user.setActivity("!scrapbook");
});

client.on('message', msg => {
    if (msg.content.startsWith("!scrapbook")) {
        var parts = msg.content.split(' ');

        if (parts.length === 1 || parts[1].toLowerCase() === "help") {
            msg.channel.send(
                "prefix: !scrapbook\n" +
                "\`help\` - Displays list of commands\n" +
                "\`track <username>...\` - sync user(s)'s scrapbook post to active channel\n" +
                "\`notrack <username>...\` - stop syncing user(s)'s scrapbook post to active channel\n" +
                "\`notify <@role>\` - notify specific role of new posts\n" +
                "\`nonotify\` - stop notifications\n" +
                "\`test\` - make a test notification\n" +
                "\`info\` - display some neat info"
                
            );
            return;
        }

        switch(parts[1].toLowerCase()) {
            case ("track"):
                if (parts.length < 3) return msg.reply("track command requires at least 1 option (username).");
                if (!msg.member) return msg.reply("couldn't get member status of user. This is usually caused by the command being run in a DM which is unsupported.");
                if (!msg.member.hasPermission("ADMINISTRATOR")) return msg.reply("only administrators may set notification role.");

                var newTracking = "";

                for (let i = 2; i < parts.length; i++) {
                    let username = parts[i];
                    if (username.length > 0) {
                        let path = `channels.${msg.channel.id}.users.${username}`;
                        if (!db.has(path).value()) {
                            db.set(path, {
                                ids: []
                            }).write();
                            newTracking += username + ', ';
                        } else {
                            msg.reply(`already tracking ${username} in this channel"`);
                        }
                    } else {
                        msg.reply(`invalid username "${username}"`);
                    }
                }
                
                if (newTracking.length > 0) msg.reply(`now tracking ${newTracking.substr(0, newTracking.length-2)}!`);

                return;
            case ("notrack"):
                if (parts.length < 3) return msg.reply("notrack command requires at least 1 option (username).");
                if (!msg.member) return msg.reply("couldn't get member status of user. This is usually caused by the command being run in a DM which is unsupported.");
                if (!msg.member.hasPermission("ADMINISTRATOR")) return msg.reply("only administrators may set notification role.");

                var stoppedTracking = "";

                for (let i = 2; i < parts.length; i++) {
                    let username = parts[i];
                    if (username.length > 0) {
                        let path = `channels.${msg.channel.id}.users.${username}`;
                        if (db.has(path).value()) {
                            db.unset(path).write();
                            stoppedTracking += username + ', ';
                        } else {
                            msg.reply(`already not tracking ${username} in this channel"`);
                        }
                    } else {
                        msg.reply(`invalid username "${username}"`);
                    }
                }
                
                if (stoppedTracking.length > 0) msg.reply(`stopped tracking ${stoppedTracking.substr(0, stoppedTracking.length-2)}!`);

                return;
            case ("notify"):
                if (!msg.guild) return msg.reply("notify can only be called from in a guild.");
                if (parts.length !== 3) return msg.reply("notify commpand requires 1 option (role).");
                if (!msg.member) return msg.reply("couldn't get member status of user. This is usually caused by the command being run in a DM which is unsupported.");
                if (!msg.member.hasPermission("ADMINISTRATOR")) return msg.reply("only administrators may set notification role.");

                if (parts[2].length !== 22) return (msg.reply("failed to get role id. Did you provide a valid role?"));

                let roleId = parts[2].substr(3, 18);

                msg.guild.roles.fetch(roleId).then(role => {
                    if (role === null) return msg.reply("role does not exist.");
                    db.set(`channels.${msg.channel.id}.notify`, roleId).write();
                    msg.reply(`now notifying @ ${role.name} of new scrapbook posts!`);
                }).catch(err => {
                    msg.reply("failed to fetch role.");
                    console.error("Failed to fetch role ", err);
                });
                return;
            case ("nonotify"):
                if (!msg.guild) return msg.reply("nonotify can only be called from in a guild.");
                if (!msg.member) return msg.reply("couldn't get member status of user. This is usually caused by the command being run in a DM which is unsupported.");
                if (!msg.member.hasPermission("ADMINISTRATOR")) return msg.reply("only administrators may set notification role.");
                if (!db.has(`channels.${msg.channel.id}.notify`).value()) return msg.reply("can't stop notifications if no one is being notified.");

                db.unset(`channels.${msg.channel.id}.notify`).write();
                msg.reply("stopped notifications for this channel.");
                return;
            case ("test"):
                if (!msg.member) return msg.reply("couldn't get member status of user. This is usually caused by the command being run in a DM which is unsupported.");
                if (!msg.member.hasPermission("ADMINISTRATOR")) return msg.reply("only administrators may send test posts.");
                if (!db.has(`channels.${msg.channel.id}`).value()) return msg.reply("must have already started scrapbook in this channel.");

                sendPost(msg.channel, {
                    text: "This is a test post!",
                    user: {
                        username: "testman",
                        streakCount: 999
                    },
                    attachments: [
                        {
                            url: "https://www.google.com/images/branding/googlelogo/1x/googlelogo_color_272x92dp.png"
                        }
                    ]
                })
                return;
            case ("info"):
                var tracking = Object.keys(db.get(`channels.${msg.channel.id}.users`).value() || {});
                msg.channel.send(
                    (tracking.length > 0 ? `Currently tracking: ${tracking}\n` : "Not tracking any user\n") +
                    (msg.guild && db.has(`channels.${msg.channel.id}.notify`).value() ? `Will notify role with id ${db.get(`channels.${msg.channel.id}.notify`).value()} of new posts\n` : '') +
                    `Contribute to the code: https://github.com/clay53/hackClubScrapbookBot\n` +
                    `Donate (BCH): \`qra9n9q2g23dfs3z6jnduletu3er4892jsmdemyt5u\`\n` +
                    `Currently syncing across ${Object.keys(db.get('channels').value()).length} channels!`
                );
                return;
        }
    }
});

// Sync channels
setInterval(() => {
    request('https://scrapbook.hackclub.com/api/posts', {json: true}, (err, res, body) => {
        if (!err && res.statusCode == 200) {
            console.log("Syncing...");
            var postCount = 0;

            let channels = db.get('channels').value();
            let channelIds = Object.keys(channels)
            for (let i = body.length-1; i >= 0; i--) {
                let post = body[i];
                for (let j = 0; j < channelIds.length; j++) {
                    let channelId = channelIds[j];
                    let channel = channels[channelId];

                    let usernames = Object.keys(channel.users);
                    for (let k = 0; k < usernames.length; k++) {
                        let username = usernames[k];
                        let ids = channel.users[username].ids || [];
                        if (username === post.user.username) {
                            if (!ids.includes(post.id)) {
                                postCount++;
                                client.channels.fetch(channelId).then(c => {
                                    sendPost(c, post);
                                    db.get(`channels.${channelId}.users.${username}.ids`).push(post.id).write();
                                }).catch(err => {
                                    if (err.code === 10003 || err.code === 50001) {
                                        console.log(`Channel ${channelId} is inaccessible, removing...`);
                                        db.unset(`channels.${channelId}`).write();
                                    } else {
                                        console.error(`Failed to fetch channel ${channelId}`, err);
                                    }
                                });
                            }
                        }
                    }
                }
            }
            console.log(`Made ${postCount} posts!`);
        } else {
            console.error("Failed to get scrapbook posts", body);
        }
    })
}, 20000);

function sendPost(channel, post) {
    channel.send(
        `${db.has(`channels.${channel.id}.notify`).value() ? `<@&${db.get(`channels.${channel.id}.notify`).value()}> ` : ''}${post.user.username} is now on a ${post.user.streakCount} day streak!\n${post.text}`,
        {
            files: post.attachments.map(file => file.url)
        }
    );
}

client.login(TOKEN);