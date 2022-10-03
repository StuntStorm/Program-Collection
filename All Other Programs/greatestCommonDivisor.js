const greatestCommonDivisor = (num1, num2) => {
  while (num1 != num2) {
    if (num1 > num2) {
      num1 = num1 - num2;
    } else {
      num2 = num2 - num1;
    }
  }

  console.log(`Greatest common divider is ${num1}`);
};

greatestCommonDivisor(2, 4);
greatestCommonDivisor(20, 40);
greatestCommonDivisor(25, 41);
greatestCommonDivisor(104, 33);
