package javadietelpractice3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarApplicationTest {
    Car car;
    @BeforeEach
    public void startAllWithThis() {
        car = new Car("1234", "2024", 5000);
    }
    @Test
    public void test_That_When_I_Create_A_Car_I_have_A_Car(){
        car.setModel("1234");
        assertEquals("1234", car.getModel());
        car.setYear("2024");
        assertEquals("2024", car.getYear());
        car.setPrice(5000);
        assertEquals("350.00", car.getPrice());
    }
    @Test
    public void test_To_Create_Another_Car_With_Negative_Price(){
        Car car2 = new Car ("2468", "2024", -2000);
        car2.setModel("2468");
        assertEquals("2468", car2.getModel());
        car2.setYear("2024");
        assertEquals("2024", car2.getYear());
        car2.setPrice(-2000);
        assertEquals("0.00", car2.getPrice());
    }
    @Test
    public void test_To_Create_Another_Car_With_Zero_Price(){
        Car car2 = new Car ("2468", "2024", 0);
        car2.setModel("2468");
        assertEquals("2468", car2.getModel());
        car2.setYear("2024");
        assertEquals("2024", car2.getYear());
        car2.setPrice(0);
        assertEquals("0.00", car2.getPrice());
    }
    @Test
    public void test_To_Count_Number_Of_Cars_Created(){
        car.setModel("1234");
        assertEquals("1234", car.getModel());
        car.setYear("2024");
        assertEquals("2024", car.getYear());
        car.setPrice(5000);
        assertEquals("250.00", car.getPrice());
        Car car2 = new Car ("2243", "2025", 900);
        car2.setModel("2243");
        assertEquals("2243", car2.getModel());
        car2.setYear("2025");
        assertEquals("2025", car2.getYear());
        car2.setPrice(900);
        assertEquals("63.00", car2.getPrice());

        Car car3 = new Car("3631", "2023", 400);
        car3.setModel("3631");
        assertEquals("3631", car3.getModel());
        car3.setYear("2023");
        assertEquals("2023", car3.getYear());
        car3.setPrice(400);
        assertEquals("28.00", car3.getPrice());

       assertEquals(3, car.getNumberOfCars());
    }
}
