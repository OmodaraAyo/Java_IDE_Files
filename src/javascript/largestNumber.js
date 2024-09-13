function largestAndSmallestNumber(number){
    let newNumber = [];
    let min = number[0];
    let max = number[0];
    for(let counter = 0; counter < number.length; counter++){
        if(number[counter] < min) min = number[counter];
        if(number[counter] > max) max = number[counter];
    }
    newNumber.push(min);
    newNumber.push(max);
    return newNumber;
}

console.log(largestAndSmallestNumber([5,3,4,9,8]));