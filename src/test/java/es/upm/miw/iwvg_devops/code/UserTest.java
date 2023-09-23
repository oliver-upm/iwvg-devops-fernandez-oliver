package es.upm.miw.iwvg_devops.code;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UserTest {

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
    void testAddFraction(){
        Fraction fraction = new Fraction(1,2);
        user.addFraction(fraction);
        assertEquals(fraction, user.getFractions().get(0));
    }
    @Test
    void testFullName() {
        assertEquals("Pepe Perez", user.fullName());
    }

    @Test
    void testInitials() {
        assertEquals("P.", user.initials());
    }

    @Test
    void testToString() {
        String expected = "User{" +
                "id='" + user.getId() + '\'' +
                ", name='" + user.getName() + '\'' +
                ", familyName='" + user.getFamilyName() + '\'' +
                ", fractions=" + user.getFractions() +
                '}';
        assertEquals(expected, user.toString());
    }
}
