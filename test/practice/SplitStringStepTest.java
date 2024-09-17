package practice;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SplitStringStepTest {
    SplitStringStep step;
    @Test
    public void test_that_SplitStringStep_Exist() {
        step = new SplitStringStep();
    }
    @Test
    public void test_that_SplitStringStep_Functionality_One() {
        String userInput = "Ayodele";
        List<String> actual = step.isSplitStringStep(userInput);
        List<String> expected = Arrays.asList("'Ay'", "'od'", "'el'", "'e_'");
        assertEquals(expected, actual);
    }
    @Test
    public void test_that_SplitStringStep_Functionality_Two() {
        String userInput = "Ayodelee";
        List<String> actual = step.isSplitStringStep(userInput);
        List<String> expected = Arrays.asList("'Ay'", "'od'", "'el'", "'ee'");
        assertEquals(expected, actual);
    }
}
