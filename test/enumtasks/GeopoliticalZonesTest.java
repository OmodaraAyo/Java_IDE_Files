package enumtasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeopoliticalZonesTest {
    GeopoliticalZones zones;
    @Test
    public void test_that_GeopoliticalZones_Exist() {
        GeopoliticalZones zones;
    }
    @Test
    public void test_to_get_Description_Of_first_GeopoliticalZone() {
        zones = GeopoliticalZones.NORTHEAST;
        String expected = "Adamawa \nBauchi \nBorno \nGombe \nTaraba \nYobe";
        assertEquals(expected, zones.getDescription());
    }
    @Test
    public void test_to_get_Description_Of_second_GeopoliticalZone() {
        zones = GeopoliticalZones.NORTHWEST;
        String expected = "Zamfara \nSokoto \nKebbi \nKatsina \nKano \nKaduna, Jigawa";
        assertEquals(expected, zones.getDescription());
    }
    @Test
    public void test_to_get_Description_Of_third_GeopoliticalZone() {
        zones = GeopoliticalZones.NORTHCENTRAL;
        String expected = "Plateau \nNiger \nNasarawa \nKwara \nKogi \nAbuja \nBenue";
        assertEquals(expected, zones.getDescription());
    }
    @Test
    public void test_to_get_Description_Of_fourth_GeopoliticalZone() {
        zones = GeopoliticalZones.SOUTHEAST;
        String expected = "Imo \nEnugu \nEbonyi \nAnambra \nAbia";
        assertEquals(expected, zones.getDescription());
    }
    @Test
    public void test_to_get_Description_Of_fifth_GeopoliticalZone() {
        zones = GeopoliticalZones.SOUTHWEST;
        String expected = "Ekiti \nLagos \nOgun \nOsun \nOyo";
        assertEquals(expected, zones.getDescription());
    }
    @Test
    public void test_to_get_Description_Of_sixth_GeopoliticalZone() {
        zones = GeopoliticalZones.SOUTHSOUTH;
        String expected = "Rivers \nEdo \nDelta \nCross River \nBayelsa \nAkwa Ibom";
        assertEquals(expected, zones.getDescription());
    }
}
