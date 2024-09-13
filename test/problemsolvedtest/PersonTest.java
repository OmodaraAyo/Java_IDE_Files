package problemsolvedtest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import problemsolved.Person;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PersonTest {
    Person person;

    @BeforeEach
    public void startAllWithThis() {
        person = new Person();
    }
    @Test
    public void test_That_If_There_Is_A_Person() {
        assertTrue(person.exist());
    }
    @Test
    public void test_That_If_The_Person_Have_A_Name() {
        assertTrue(person.exist());
        person.hasName("Franklin saint");
        assertEquals("Franklin saint", person.getName());
    }
}
