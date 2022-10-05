const fibonacci = (fibonacciLength) => {
    if(checkIfNumbers(fibonacciLength)){
        let result = [];

        for (let index = 0; index < fibonacciLength; index++){
            if (index == 0 || index == 1) {result.push(index);}else{
                result.push(result[index - 1] + result[index - 2])
            }
        }
        return result.reduce((previousNums, currentNum) => previousNums += " " + currentNum , `Fibonacci Sequence of ${fibonacciLength} is:`);
    }else{
        return "ERROR. Value must be a number"
    }
}

const checkIfNumbers = (num1) => !isNaN(num1);