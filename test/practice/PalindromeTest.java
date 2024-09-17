package practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PalindromeTest {
    Palindrome palindrome;
    @Test
    public void test_that_Palindrome_object_exist(){
        palindrome = new Palindrome();
    }
    @Test
    public void test_that_Palindrome_Funtionality(){
        String input = "racecar";
        String expected = Palindrome.isPalindrome(input);
        String actual = "It is a palindrome";
        assertEquals(actual, expected);
    }
    @Test
    public void test_that_Palindrome_Funtionality_with_Numbers(){
        String input = "101101";
        String expected = Palindrome.isPalindrome(input);
        String actual = "It is a palindrome";
        assertEquals(actual, expected);
    }
    @Test
    public void test_that_Palindrome_Funtionality_With_a_none_palindrome_String(){
        String input = "Ayodele";
        String expected = Palindrome.isPalindrome(input);
        String actual = "It is not a palindrome";
        assertEquals(actual, expected);
    }
    @Test
    public void test_that_Palindrome_Funtionality_input_isPalindrome(){
        String input = "race car";
        String expected = Palindrome.isPalindrome(input);
        String actual = "It is a palindrome";
        assertEquals(actual, expected);
    }
    @Test
    public void test_that_Palindrome_Funtionality_ignoreSpaces(){
        String input = "race car";
        String expected = Palindrome.isPalindrome(input);
        String actual = "It is a palindrome";
        assertEquals(actual, expected);
    }
    @Test
    public void test_that_Palindrome_Funtionality_ignore_CharacterSize(){
        String input = "RacEcar";
        String expected = Palindrome.isPalindrome(input);
        String actual = "It is a palindrome";
        assertEquals(actual, expected);
    }
    @Test
    public void test_For_Palindrome2_Funtionality_ignore_CharacterSize(){
        String input = "RacEcar";
        boolean expected = Palindrome.isPalindrome2(input);
        assertTrue(expected);
    }
}
