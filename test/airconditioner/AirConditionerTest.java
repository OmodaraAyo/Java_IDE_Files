package airconditioner;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirConditionerTest {
    @Test
    public void testToTurnOn_AirConditioner(){
        AirConditioner ac = new AirConditioner();
        assertTrue(ac.setOn());
    }
    @Test
    public void testToTurnOff_AirConditioner(){
        AirConditioner ac = new AirConditioner();
        assertFalse(ac.setOff());
    }
    @Test
    public void testToIncrease_Temperature(){
        AirConditioner ac = new AirConditioner();
        assertTrue(ac.setOn());
        ac.increaseTemperature(13);
        assertEquals(29, ac.getTemperature());
    }
    @Test
    public void testToDecrease_Temperature(){
        AirConditioner ac = new AirConditioner();
        assertTrue(ac.setOn());
        ac.increaseTemperature(1);
        assertEquals(17, ac.getTemperature());
        ac.decreaseTemperature(9);
        assertEquals(16, ac.getTemperature());
    }
}
