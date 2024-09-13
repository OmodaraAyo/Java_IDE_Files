package creditcardvalidator;

import java.util.Scanner;

public class CardValidatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hello, kindly Enter Card details to verify: ");
        String cardNumber = scanner.nextLine();
        CardValidator cardValidator = new CardValidator();
        cardValidator.validateCard(cardNumber);
        print(cardValidator.CardInfo());
    }
    private static void print(Object input){
        System.out.println(input);
    }
}
