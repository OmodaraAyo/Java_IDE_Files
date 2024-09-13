package javadietelpractice3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClockTest {
    Clock clock;

    @BeforeEach
    public void startAllWithThis() {
        clock = new Clock();
    }
    @Test
    public void testClock() {
        clock.setTime(10,41,16);
        assertEquals("10:41:16", clock.getTime());
    }
    @Test
    public void test_To_Pass_A_Negative_Time() {
        clock.setTime(-10,-41,-16);
        assertEquals("0:0:0", clock.getTime());
    }
}