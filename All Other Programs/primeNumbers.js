const primeNumbers = (firstNumber, secondNumber) =>{
    if(checkIfNumbers(firstNumber, secondNumber)){
        let result = "";

        for (let index = firstNumber; index <= secondNumber; index++){
            if (esPrimo(index) == 1) result += index + " ";
        }

        return result;
    }else{
        return "ERROR. Both values must be numbers"
    }
}

const checkIfNumbers = (num1, num2) => !isNaN(num1) && !isNaN(num2)

function esPrimo(num){
    let numsResultCero = 0;

    for (let index = num; index > 1 ; index--){
        if (num % index == 0) numsResultCero++;
    }

    return numsResultCero;
}