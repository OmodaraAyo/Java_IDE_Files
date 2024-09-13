function calculator(left_operand, operator, right_operand){
    let answer = 0;
    if(operator == '+'){
        answer = Number (left_operand) + Number (right_operand);
    }
    else if(operator == '-'){
        answer = Number (left_operand) - Number (right_operand);
    }
    else if(operator == '*'){
        answer = Number(left_operand) * Number (right_operand);
    }
    else if(operator == '/'){
        answer = Number(left_operand) / Number (right_operand);
    }
    else{
        answer = NaN;
    }
    return answer;
}

let userInput = calculator("10", '-', "5");
console.log(userInput);