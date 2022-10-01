function fizzy(n) {
  let answer = [];
  for (let i = 1; i <= n; i++) {
    if (i % 5 == 0 && i % 3 == 0) {
      answer.push("FizzBuzz");
    } else if (i % 5 == 0) {
      answer.push("Buzz");
    } else if (i % 3 == 0) {
      answer.push("Fizz");
    } else {
      answer.push(i.toString());
    }
  }
  return answer;
}
console.log(fizzy(15));
