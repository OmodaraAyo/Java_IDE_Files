package creditcardvalidator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ValidateCardTest {
    ValidateCard cardValidator;
    @Test
    public void test_that_ValidateCard_exist() {
        cardValidator = new ValidateCard("12345678901223");
    }
    @Test
    public void test_ValidateCard_functionality_if_card_isNot_Valid() {
        cardValidator = new ValidateCard("12345678901223");
        String expected = "0";
        assertEquals(expected, cardValidator.getCardNumber());
    }
    @Test
    public void test_ValidateCard_functionality_if_card_is_valid() {
        ValidateCard cardvalidator2 = new ValidateCard("4388576018410707");
        String expected = "4388576018410707";
        assertEquals(expected, cardvalidator2.getCardNumber());
    }
}
