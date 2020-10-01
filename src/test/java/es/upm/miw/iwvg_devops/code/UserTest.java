package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class UserTest {
    User user;

    @BeforeEach
    void setup() {
        user = new User("id-1", "Alejandro", "Cabezas", new ArrayList<>());
    }

    @Test
    void testFullName() {
        assertEquals("Alejandro Cabezas", user.fullName());
    }

    @Test
    void testInitials() {
        assertEquals("A.", user.initials());
    }

    @Test
    void testEmptyConstructor() {
        user = new User();
        assertTrue(user.getFractions().isEmpty());
    }

    @Test
    void testAddFraction() {
        user = new User();
        user.addFraction(new Fraction());
        assertEquals(1, user.getFractions().size());
    }

}
