const calculateTip = (bill, numOfPerson, tipPercentage) => {
    let tip = bill * (tipPercentage / 100);
    let totalBill = bill + tip;
    let perPersonPay = (totalBill / numOfPerson);

    return `    
        Initial Bill: ${bill.toFixed(2)}
        Tip Percentage: ${tipPercentage}%
        Tip Amount: ${tip.toFixed(2)}
        Total: ${totalBill.toFixed(2)}
        Each Person Pay: ${perPersonPay.toFixed(2)}
    `
}