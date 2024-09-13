package practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EAOCounterTest {
    EAOCounter counter = new EAOCounter();
    @Test
    public void test_That_EAOCounter_Exist(){
        EAOCounter count = new EAOCounter();
    }
    @Test
    public void test_EAOCounter_Functionality(){
        int [] userInput = {2,1,5,7,8};
        counter.getAndOddCounter(userInput);
        int [] actual = counter.getCount();
        int [] expected = {2,3};
        assertArrayEquals(expected,actual);
    }
    @Test
    public void test_EAOCounter_Functionality2(){
        int [] userInput2 = {4,1,5,7,9};
        counter.getAndOddCounter(userInput2);
        int [] expected2 = {1,4};
        assertArrayEquals(expected2,counter.getCount());
    }
}
