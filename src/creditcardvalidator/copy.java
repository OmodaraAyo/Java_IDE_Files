package creditcardvalidator;

import java.util.ArrayList;
import java.util.List;

public class copy {
    public static void main(String[] args) {
            List<Integer> cardDigit = new ArrayList<>();
            String userInput = "4388576018410707";
            int even = 0;
            int odd = 0;
            for(int counter = 0; counter < userInput.length(); counter++) {
                cardDigit.add(Integer.parseInt(String.valueOf(userInput.charAt(counter))));
            }
            for(int counter = cardDigit.size() - 1; counter >= 0; counter--) {
                if(counter % 2 == 0) {
                    int element = cardDigit.get(counter);
                    int newElement = element * 2;
                    cardDigit.set(counter, newElement);
                    if (newElement > 9){
                        int floorDivisionOfNumber = newElement / 10;
                        int remainderOfNumber = newElement % 10;
                        int sum = floorDivisionOfNumber + remainderOfNumber;
                        even += sum;
                    }
                    else {
                        even += newElement;
                    }
                }else
                if(counter % 2 != 0) {
                    int count = cardDigit.get(counter);
                    System.out.println("count = "+count);
                    odd += count;
                }
            }
            System.out.println("even = "+even);
            System.out.println("odd = "+odd);
            int summation = even + odd;
            if(summation % 10 == 0){
                System.out.println("Card is valid");
            }
            else{
                System.out.println("Card is not valid");
            }
    }
}
//// comments: Learning
////        cardDigit.add(Integer.parseInt(String.valueOf(userInput.charAt(counter))));
////cardDigit.add((int)(userInput.charAt(counter)));
////This would have gotten me the ascii value of charAt(counter)
//// And Integer.parseInt(expect a (String input))
////        for(int counter = cardDigit.size() - 1; counter >= 0; counter--) {
////            if(counter % 2 == 0) {
////                char ch = userInput.charAt(counter);
////                int digit = (ch - '0') * 2;
////                if (digit > 9){
////                   int floorNumber = digit / 10;
////                   int remainder = digit % 10;
////                   int newDigit = floorNumber + remainder;
////                   even +=newDigit;
////                }else {
////                    even += digit;
////                }
////                cardDigit.add(digit);
////            } else
////            if (counter % 2 != 0) {
////                char ch = userInput.charAt(counter);
////                int digit = ch - '0';
////                cardDigit2.add(digit);
////                odd += digit;
////            }
////regretion
//}
