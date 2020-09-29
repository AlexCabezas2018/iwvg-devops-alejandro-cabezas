package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {
    User user;

    @BeforeEach
    public void setup() {
        user = new User("id-1", "Alejandro", "Cabezas", new ArrayList<>());
    }

    @Test
    public void testFullName() {
        assertEquals("Alejandro Cabezas", user.fullName());
    }

    @Test
    public void testInitials() {
        assertEquals("A.", user.initials());
    }

}
