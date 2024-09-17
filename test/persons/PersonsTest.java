package persons;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import person.Persons;

import static org.junit.jupiter.api.Assertions.*;

public class PersonsTest {
    Persons person;
    Persons person2;
    @BeforeEach
    void startAllWithThis(){
        person = new Persons("Ayodele Omodara", "Oniru Estate, (VI), Lagos",
                "07012347161", "cece123@gmail.com");
        person2 = new Persons("Daniel Benson","Oniru Estate, (VI), Lagos",
                "07012341991", "daniel2343@gmail.com");
    }
    @Test
    @DisplayName("Does a person exist ?")
    //default access modifier
    void test_Person_exist(){
        assertTrue(person.isExisting());
    }
    @Test
    @DisplayName("Person Name Test")
    void test_that_person_has_a_name(){
        String expected = "Ayodele Omodara";
        assertEquals(expected, person.getName());
    }
    @Test
    @DisplayName("Person address")
    void test_that_person_has_an_Address(){
        String expected = "Oniru Estate, (VI), Lagos";
        assertEquals(expected, person.getAddress());
    }
    @Test
    @DisplayName("Person phone Number")
    void test_that_person_has_a_PhoneNumber(){
        String expected = "07012347161";
        assertEquals(expected, person.getPhoneNumber());
    }
    @Test
    @DisplayName("Person Email address")
    void test_that_person_has_an_Email(){
        String expected = "cece123@gmail.com";
        assertEquals(expected, person.getEmailAddress());
    }
    @Test
    @DisplayName("Person3 phone number is invalid")
    void test_that_a_new_person_has_A_Wrong_phoneNumber(){
        Persons person3 = new Persons("Dave mark", "22, ccvv, ikeja-Lagos",
                "07028392","asysowj@gmail.com");
        String expected = "Invalid Phone Number";
        assertEquals(expected, person3.getPhoneNumber());
    }
}
