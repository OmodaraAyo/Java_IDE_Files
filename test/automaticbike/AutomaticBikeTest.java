package automaticbike;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AutomaticBikeTest {
    @Test
    public void testToTurnOn_Bike(){
        Bike bike = new Bike();
        assertTrue(bike.turnOn());
    }
    @Test
    public void testToTurnOff_Bike(){
        Bike bike = new Bike();
        assertFalse(bike.turnOff());
    }
    @Test
    public void when_BikeIsOn_testThatBikeAccelerateAt_GearOne(){
        Bike bike = new Bike();
        assertTrue(bike.turnOn());
        bike.accelerate(1,19);
        assertEquals(20, bike.accelerate());
    }
    @Test
    public void when_BikeIsOn_testThatBikeAccelerateAt_GearTwo(){
        Bike bike = new Bike();
        assertTrue(bike.turnOn());
        bike.accelerate(2,24);
        assertEquals(26, bike.accelerate());
    }
    @Test
    public void when_BikeIsOn_testThatBikeAccelerateAt_GearThree(){
        Bike bike = new Bike();
        assertTrue(bike.turnOn());
        bike.accelerate(3, 35);
        assertEquals(38, bike.accelerate());
    }
    @Test
    public void when_BikeIsOn_testThatBikeAccelerateAt_GearFour(){
        Bike bike = new Bike();
        assertTrue(bike.turnOn());
        bike.accelerate(4, 44);
        assertEquals(48, bike.accelerate());
    }
    @Test
    public void when_BikeIsOn_testThatBikeDeccelerateAt_GearOne(){
        Bike bike = new Bike();
        assertTrue(bike.turnOn());
        bike.deccelerate(1,15);
        assertEquals(14, bike.deccelerate());
    }
    @Test
    public void when_BikeIsOn_testThatBikeDeccelerateAt_GearTwo(){
        Bike bike = new Bike();
        assertTrue(bike.turnOn());
        bike.deccelerate(2,24);
        assertEquals(22, bike.deccelerate());
    }
    @Test
    public void when_BikeIsOn_testThatBikeDeccelerateAt_GearThree(){
        Bike bike = new Bike();
        assertTrue(bike.turnOn());
        bike.deccelerate(3, 35);
        assertEquals(32, bike.deccelerate());
    }
    @Test
    public void when_BikeIsOn_testThatBikeDeccelerateAt_GearFour(){
        Bike bike = new Bike();
        assertTrue(bike.turnOn());
        bike.deccelerate(4, 44);
        assertEquals(40, bike.deccelerate());
    }
}
