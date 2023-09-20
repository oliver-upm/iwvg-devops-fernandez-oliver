package es.upm.miw.iwvg_devops.code;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserTest {

    private User user;

    @BeforeEach
    void before() {
        user = new User("1234", "Pepe", "Perez", new ArrayList<Fraction>());
    }

    @Test
    void testUser() {
        user = new User();
        assertEquals(new ArrayList<>(), user.getFractions());
    }

    @Test
    void testUserParams() {
        assertEquals("1234", user.getId());
        assertEquals("Pepe", user.getName());
        assertEquals("Perez", user.getFamilyName());
        assertEquals(new ArrayList<>(), user.getFractions());
    }

    @Test
    void testSetters() {
        user.setName("Juan");
        user.setFamilyName("Garcia");
        user.setFractions(new ArrayList<>());
        assertEquals("Juan", user.getName());
        assertEquals("Garcia", user.getFamilyName());
        assertEquals(new ArrayList<>(), user.getFractions());
    }

    @Test
    void fullName() {
        assertEquals("Pepe Perez", user.fullName());
    }

    @Test
    void initials() {
        assertEquals("P.", user.initials());
    }
}
