function genRandNumber() {
    const num = Math.round(parseInt(Math.random() * 100));
    return num;
}

const number = genRandNumber();
let chances = 1;
let userInput;
let userInputNumber;
do {
    userInput = prompt("Enter your Guessed Number")
    userInputNumber = parseInt(userInput);
    if (number < userInputNumber) {
        console.log("Your Guessed Number is Greater than actual number :(")
    } else if (number > userInputNumber) {
        console.log("Your Guessed Number is Smaller than actual number :(")
    } else {
        console.log("Whoaaaa!!!!!")
        console.log(`The Actual Number is ${number} and your score is ${100 - (chances - 1)} !!!!!`)
        break;
    }
    chances++;
} while (number !== userInputNumber);
console.log("Thanks for playing :)")