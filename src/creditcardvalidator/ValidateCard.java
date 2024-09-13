package creditcardvalidator;

import java.util.ArrayList;
import java.util.List;

public class ValidateCard {
    List<Integer> cardDigit = new ArrayList<>();
    private String cardNumber;
    public ValidateCard(String cardNumber) {
        setCardNumber(cardNumber);
    }
    public void setCardNumber(String cardNumber){
        int even = 0;
        int odd = 0;

        for(int counter = 0; counter < cardNumber.length(); counter++) {
            if(Character.isDigit(cardNumber.charAt(counter))) {
                cardDigit.add(Integer.parseInt(String.valueOf(cardNumber.charAt(counter))));
            }
            else{
                this.cardNumber = "0";
                break;
            }
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
            }
            else{
                odd += cardDigit.get(counter);
            }

        }
        int summation = even + odd;
        if(summation % 10 == 0){
            this.cardNumber = cardNumber;
        }
        else{
            this.cardNumber = "0";
        }
    }
    public String getCardNumber() {
        return cardNumber;
    }
}