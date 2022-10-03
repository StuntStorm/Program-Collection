let BMIcalculation = (weight, height) => {
  let BMI = weight / (height * height);
  if (BMI < 18.5) {
    console.log("You are underweight");
  } else if (BMI >= 18.5 && BMI < 25) {
    console.log("Your weight is in a healthy range");
  } else if (BMI >= 25 && BMI < 30) {
    console.log("You are overweight");
  } else if (BMI >= 30) {
    console.log("You are obese");
  } else {
    console.log("Please enter weight and height");
  }
};

BMIcalculation(80, 1.65);
BMIcalculation(70, 1.86);
BMIcalculation(55, 1.9);
