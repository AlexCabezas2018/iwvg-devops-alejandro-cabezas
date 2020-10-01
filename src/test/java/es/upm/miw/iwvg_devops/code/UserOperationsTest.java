package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserOperationsTest {
    private UserOperations userOperations;

    @BeforeEach
    void setup() {
        userOperations = new UserOperations();
    }

    @Test
    void testFindUserIdBySomeProperFractionFindsUserId() {
        Fraction fractionToSearch = new Fraction(0, 1);
        String userId = userOperations.findUserIdBySomeProperFraction(fractionToSearch);
        assertEquals("1", userId);
    }

    @Test
    void testFindUserIdBySomeProperFractionDoesNotFindUserId() {
        Fraction fractionToSearch = new Fraction(0, 10);
        String userId = userOperations.findUserIdBySomeProperFraction(fractionToSearch);
        assertNull(userId);
    }

    @Test
    void testFindUserIdBySomeProperFractionFractionIsImproper() {
        Fraction fractionToSearch = new Fraction(10, 7);
        assertThrows(AssertionError.class, () -> userOperations.findUserIdBySomeProperFraction(fractionToSearch));
    }

    @Test
    void testFindUserNameBySomeImproperFractionFindsUserName() {
        Fraction fractionToSearch = new Fraction(1, 0);
        String userId = userOperations.findUserNameBySomeImproperFraction(fractionToSearch);
        assertEquals("Paula", userId);
    }

    @Test
    void testFindUserNameBySomeImproperFractionDoesNotFindUserName() {
        Fraction fractionToSearch = new Fraction(100, 70);
        String userId = userOperations.findUserNameBySomeImproperFraction(fractionToSearch);
        assertNull(userId);
    }

    @Test
    void testFindUserNameBySomeImproperFractionFractionIsProper() {
        Fraction fractionToSearch = new Fraction(7, 10);
        assertThrows(AssertionError.class, () -> userOperations.findUserNameBySomeImproperFraction(fractionToSearch));
    }
}
