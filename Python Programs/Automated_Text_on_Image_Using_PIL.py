from PIL import Image, ImageFont, ImageDraw
test_image = Image.open("sbik copy.png")
W,H=(4320,4320)
my_font = ImageFont.truetype("Quadrats.ttf", 850)
i = 0
while i!=10001:
    text3=str(i)
    im = Image.new("RGBA", (W, H), "black")
    draw = ImageDraw.Draw(im)
    #image_edit.text((2160, 2160), text3, (237, 230, 211),font=my_font, align="left")
    w, h = draw.textsize(text3)
    draw.text((W / 2, H / 2), text3, fill="white", font=my_font, anchor="mm")
    im.save("Sbik_images/"+str(i)+".png")
    i=i+1
