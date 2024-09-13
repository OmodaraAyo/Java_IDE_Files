package creditcardvalidator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CardValidatorTest {
    CardValidator validator;
    @BeforeEach
    public void startAllWithThis(){
       validator =  new CardValidator();
    }
    @Test
    public void test_that_A_CardValidator_Class_Exist(){
        new CardValidator();
    }
    @Test
    public void test_that_the_card_has_numbers(){
        validator.setCardNumber("423456789123456");
        assertEquals("423456789123456", validator.getCardNumber());
    }
    @Test
    public void test_that_cardNumbers_isUp_lesserThan_13digits(){
        validator.setCardNumber("123456");
        String expected = "123456 is not a valid card number";
        assertEquals(expected, validator.getCardNumber());
    }
    @Test
    public void test_that_cardNumbers_is_equalTo_13digits(){
        validator.setCardNumber("4234567891023");
        assertEquals("4234567891023", validator.getCardNumber());
    }
    @Test
    public void test_that_cardNumbers_is_greater_than_13digits(){
        validator.setCardNumber("423456789102345");
        assertEquals("423456789102345", validator.getCardNumber());
    }
    @Test
    public void test_that_cardNumbers_isEqual_16digits(){
        validator.setCardNumber("4234567890123456");
        assertEquals("4234567890123456", validator.getCardNumber());
    }
    @Test
    public void test_that_cardNumbers_isGreaterThan13andBelow16Digits(){
        validator.setCardNumber("4234567891234567");
        assertEquals("4234567891234567", validator.getCardNumber());
    }
    @Test
    public void test_that_cardNumbers_is_greater_than_16digits(){
        validator.setCardNumber("123456789012345678");
        String expected = "123456789012345678 is not a valid card number";
        assertEquals(expected, validator.getCardNumber());
    }
    @Test
    public void test_that_cardNumbers_starting_with_4_isValid(){
        validator.setCardNumber("4234567891234567");
    }
    @Test
    public void test_that_cardNumbers_starting_1_is_notValid(){
        validator.setCardNumber("123456789012345");
        String expected = "123456789012345 is not a valid card number";
        assertEquals(expected, validator.getCardNumber());
    }
    @Test
    public void test_that_cardNumbers_starting_with_5_isValid(){
        validator.setCardNumber("512345678901234");
        assertEquals("512345678901234", validator.getCardNumber());
    }
    @Test
    public void test_that_cardNumbers_starting_with_6_isValid(){
        validator.setCardNumber("612345678901234");
        assertEquals("612345678901234", validator.getCardNumber());
    }
    @Test
    public void test_that_cardNumbers_starting_with_37_isValid(){
        validator.setCardNumber("372345678901234");
        assertEquals("372345678901234", validator.getCardNumber());
        assertEquals(15, validator.getCardNumber().length());
    }
    @Test
    public void test_that_cardNumbers_starting_with_3_isNotValid(){
        validator.setCardNumber("392345678901234");
        String expected = "392345678901234 is not a valid card number";
        String actual = validator.getCardNumber();
        assertEquals(expected, actual);
    }
    @Test
    public void test_That_cardDigit_is_valid(){
        validator.validateCard("4388576018410707");
        String expected = "\nCredit Card Type: Visa Card\nCredit Card Number: 4388576018410707" +
                "\nCredit Card Digit Length: 16\nCredit Card Validity Status: Valid";
        assertEquals(expected, validator.CardInfo());
    }
    @Test
    @DisplayName("Invalid Card Test")
    public void test_That_cardDigit_is_Invalid(){
        validator.validateCard("392345678901234");
        String expected = "\nCredit Card Type: xxxxxxxxxxxxxxxxx\nCredit Card Number: 392345678901234" +
                "\nCredit Card Digit Length: 15\nCredit Card Validity Status: Invalid";
        assertEquals(expected, validator.CardInfo());
    }
    @Test
    @DisplayName("Non-Numerical Digit Test")
    public void test_That_If_A_Non_Numerical_Number_Was_Passed_cardDigit_is_Invalid(){
        validator.validateCard("3S2V4K678901234");
        String expected = "\nCredit Card Type: xxxxxxxxxxxxxxxxx\nCredit Card Number: 3S2V4K678901234" +
                "\nCredit Card Digit Length: 15\nCredit Card Validity Status: Invalid";
        assertEquals(expected, validator.CardInfo());
    }
    @Test
    @DisplayName("Non-Numerical Digit In A Valid Card Test")
    public void test_That_If_A_Non_Numerical_Number_Was_Passed_In_A_Valid_Card_cardDigit_is_Invalid(){
        validator.validateCard("4388O76K18410X07");
        String expected = "\nCredit Card Type: xxxxxxxxxxxxxxxxx\nCredit Card Number: 4388O76K18410X07" +
                "\nCredit Card Digit Length: 16\nCredit Card Validity Status: Invalid";
        assertEquals(expected, validator.CardInfo());
    }
}
