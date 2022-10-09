const plus = (a, b) => a + b;
const minus = (a, b) => a - b;
const times = (a, b) => a * b;
const devide = (a, b) => a / b;
const squareRoot = (a) => Math.sqrt(a);
const squareArea = (s) => s ** 2;
const cubeVolume = (s) => s ** 3;
const tubeVolume = (r, t) => 3.14 * r ** 2 * t;
const readline = require('readline').createInterface({
  input: process.stdin,
  output: process.stdout
});

function input(question) {
  return new Promise(resolve => {
    readline.question(question, data => {
      return resolve(data);
    });
  });
}

async function minusValidation(a) {
  let valid = false;

  try {
    if (a > 0) {
      valid = true;
    }

    while (!valid) {
      a = await input("Repeat, invalid input         : ");
      if (a > 0) {
        valid = true;
      }
    }

    return a;
  } catch (error) {
    console.log(error);
  }
}

async function letterValidation(a) {
  let valid = false;

  try {
    if (a > 0 || a < 0) {
      valid = true;
    }

    while (!valid) {
      a = await input("Repeat, invalid input         : ");
      if (a > 0 || a < 0) {
        valid = true;
      }
    }

    return a;
  } catch (error) {
    console.log(error);
  }
}

async function calculation(choice) {
  let result;

  try {
    if (choice > 0 && choice <= 8) {
      if (choice >= 1 && choice <= 4) {
        let a = await input("Enter the first number        : ");
        a = await letterValidation(a);
        let b = await input("Enter the second number       : ");
        b = await letterValidation(b);
        readline.close();
        if (choice == 1) {
          result = plus(+a, +b);
        } else if (choice == 2) {
          result = minus(+a, +b);
        } else if (choice == 3) {
          result = times(+a, +b);
        } else {
          result = devide(+a, +b);
        }
      } else if (choice == 5) {
        let a = await input("Enter the number              : ");
        a = await minusValidation(a);
        readline.close();
        result = squareRoot(+a);
      } else if (choice >= 6 && choice <= 7) {
        let s = await input("Enter side length             : ");
        s = await minusValidation(s);
        readline.close();
        if (choice == 6) {
          result = squareArea(+s);
        } else {
          result = cubeVolume(+s);
        }
      } else {
        let r = await input("Enter the length radius       : ");
        r = await minusValidation(r);
        let t = await input("Enter height                  : ");
        t = await minusValidation(t);
        readline.close();
        result = tubeVolume(+r, +t);
      }

      console.log("========================================");
      console.log(`Result                        : ${result}`);
    } else {
      console.clear();
      console.log("Sorry, menu options are not available! Repeat!");
      main();
    }
  } catch (error) {
    console.log(error);
  }
}

function menu() {
  console.log("========================================");
  console.log("       SIMPLE CALCULATIONS PROGRAM      ");
  console.log("========================================");
  console.log("1. Plus                   5. Square Root");
  console.log("2. Minus                  6. Square Area");
  console.log("3. Times                  7. Cube Volume");
  console.log("4. Devide                 8. Tube Volume");
  console.log("========================================");
}

async function main() {
  menu();
  let choice = await input("Enter menu options            : ");
  calculation(choice);
}

main();
