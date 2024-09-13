package creditcardvalidator;

public class CardValidator {
    private String cardNumber;
    private String cardType;
    private int cardLength;
    private String status;

    public void setCardNumber(String cardNumber) {
        boolean isGreaterThanTwelve = cardNumber.length() > 12;
        boolean isLesserThanSeventeen = cardNumber.length() <= 16;
        boolean isStartingWith4 = cardNumber.startsWith("4");
        boolean isStartingWith5 = cardNumber.startsWith("5");
        boolean isStartingWith37 = cardNumber.startsWith("37");
        boolean isStartingWith6 = cardNumber.startsWith("6");
        if (isGreaterThanTwelve && isLesserThanSeventeen && isStartingWith4 || isStartingWith5 || isStartingWith37 || isStartingWith6) {
            this.cardNumber = cardNumber;
        }
        else this.cardNumber = cardNumber + " is not a valid card number";
    }
    public void cardType(String cardNumber) {
        if(cardNumber.startsWith("4")){
            cardType = "Visa Card";
        }
        if(cardNumber.startsWith("5")){
            cardType = "Master Card";
        }
        if(cardNumber.startsWith("37")){
            cardType = "AMEX";
        }
        if(cardNumber.startsWith("6")){
            cardType = "Discover Card";
        }
        if(Character.isAlphabetic(cardNumber.charAt(0))){
            cardType = "xxxxxxxxxxxxxxxxx";
        }
    }
    public String getCardType() {
        return cardType;
    }
    public String getCardNumber() {
        return cardNumber;
    }
    public int getCardLength(){
        this.cardLength = cardNumber.length();
        return cardLength;
    }
    public void validateCard(String cardDigit) {
        ValidateCard validateCards = new ValidateCard(cardDigit);
        if(!validateCards.getCardNumber().equals("0")) {
            cardType(cardDigit);
            this.cardType = getCardType();
            this.cardNumber = validateCards.getCardNumber();
            this.cardLength = cardDigit.length();
            status = "Valid";
        }
        else{
            this.cardType = "xxxxxxxxxxxxxxxxx";
            this.cardNumber = cardDigit;
            this.cardLength = cardNumber.length();
            status = "Invalid";
        }
    }
    public String CardInfo(){
        return "\nCredit Card Type: "+cardType + "\nCredit Card Number: "
                + cardNumber + "\nCredit Card Digit Length: " + cardLength + "\nCredit Card Validity Status: " + status;
    }
}
