package main.java;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class MainTesting {
    @Test
    public void testPerson() {
        Person newPerson = new Person("Иван", "Иванов", 2);
        Assertions.assertNotNull(newPerson);
    }

    @Test
    public void testGenerateClients() {
        List<Person> attractions = Main.generateClients();
        Assertions.assertEquals(5, attractions.size());
    }

    Person newPerson = new Person("Иван", "Иванов", 2);

    @Test
    public void testTickets() {
        Assertions.assertEquals(1, newPerson.useTicket());
    }
}
