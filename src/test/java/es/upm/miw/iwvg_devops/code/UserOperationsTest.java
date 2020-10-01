package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserOperationsTest {
    private UserOperations userOperations;

    @BeforeEach
    public void setup() {
        userOperations = new UserOperations();
    }

    @Test
    public void testFindUserIdBySomeProperFractionFindsUserId() {
        Fraction fractionToSearch = new Fraction(0, 1);
        String userId = userOperations.findUserIdBySomeProperFraction(fractionToSearch);
        assertEquals("1", userId);
    }

    @Test
    public void testFindUserIdBySomeProperFractionDoesNotFindUserId() {
        Fraction fractionToSearch = new Fraction(0, 10);
        String userId = userOperations.findUserIdBySomeProperFraction(fractionToSearch);
        assertNull(userId);
    }

    @Test
    public void testFindUserIdBySomeProperFractionFractionIsImproper() {
        Fraction fractionToSearch = new Fraction(10, 7);
        assertThrows(AssertionError.class, () -> userOperations.findUserIdBySomeProperFraction(fractionToSearch));
    }
}
