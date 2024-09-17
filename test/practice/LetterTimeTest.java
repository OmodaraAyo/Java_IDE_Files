package practice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LetterTimeTest {
    LetterTime timeIs;
    @BeforeEach
    public void startAllWithThis() {
        timeIs = new LetterTime();
    }
    @Test
    public void test_that_LetterTime_class_exist(){
       LetterTime time = new LetterTime();
    }
    @Test
    public void test_that_LetterTime_Can_Get_Local_Time(){
        String expected = timeIs.getLocalTime();
        String actual = timeIs.getLocalTime();
        assertEquals(expected, actual);
    }
    @Test
    public void test_that_LetterTime_have_a_Map_of_LetterNumbers(){
            String expected = "One";
            String actual = timeIs.getElement(1);
           assertEquals(expected, actual);
    }
    @Test
    public void test_that_LetterTime_have_a_Map_of_LetterNumbers_2(){
        assertEquals("Two", timeIs.getElement(2));
    }
    @Test
    public void test_LetterTime_if_hour_equals_0() {
        String expected = "ZeroZero";
        String actual = timeIs.setHour(0);
        assertEquals(expected, actual);
    }
    @Test
    public void test_LetterTime_if_hour_greaterThan_20(){
        String expected = "TwentyOne";
        String actual = timeIs.setHour(21);
        assertEquals(expected, actual);
    }
    @Test
    public void test_LetterTime_if_minute_equals_0() {
        String expected = "ZeroZero";
        String actual = timeIs.setMinute(0);
        assertEquals(expected, actual);
    }
    @Test
    public void test_LetterTime_if_minute_greaterThan_20(){
        String expected = "TwentyOne";
        String actual = timeIs.setMinute(21);
        assertEquals(expected, actual);
    }
    @Test
    public void test_LetterTime_if_second_equals_0() {
        String expected = "Zero";
        String actual = timeIs.setSeconds(0);
    }
    @Test
    public void test_LetterTime_if_seconds_greaterThan_20(){
        String expected = "TwentyOne";
        String actual = timeIs.setSeconds(21);
        assertEquals(expected, actual);
    }
    @Test
    public void test_that_LetterTime_returns_time_in_letters(){
        String expected = timeIs.getLetterTime();
        String actual = timeIs.getLetterTime();
        assertEquals(expected, actual);
    }
}
