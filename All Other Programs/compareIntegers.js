let compareNumbers = (numberOne, numberTwo) => {
  if (numberOne < numberTwo) {
    return `${numberTwo} is bigger than ${numberOne}`;
  } else if (numberOne === numberTwo) {
    return `Both numbers are equal`;
  } else {
    return `${numberOne} is bigger than ${numberTwo} `;
  }
};

console.log(compareNumbers(1, 2));
console.log(compareNumbers(12, 2));
console.log(compareNumbers(6, 24));
console.log(compareNumbers(3, 2));
