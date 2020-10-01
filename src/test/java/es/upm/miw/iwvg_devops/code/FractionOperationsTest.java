package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FractionOperationsTest {
    private FractionOperations fractionOperations;

    @BeforeEach
    public void init() {
        fractionOperations = new FractionOperations();
    }

    @Test
    public void testFindFirstProperFractionByUserIdWithExistingUser() {
        Fraction fractionFromUser = fractionOperations.findFirstProperFractionByUserId("1");
        Fraction expectedFraction = new Fraction(0, 1);
        assertTrue(fractionFromUser.isEquivalent(expectedFraction));
    }

    @Test
    public void testFindFirstProperFractionByUserIdWithUserWithNoProperFractions() {
        Fraction fractionFromUser = fractionOperations.findFirstProperFractionByUserId("7");
        assertNull(fractionFromUser);
    }

    @Test
    public void testFindFirstProperFractionByUserIdWithNoExistingUser() {
        Fraction fractionFromUser = fractionOperations.findFirstProperFractionByUserId("8");
        assertNull(fractionFromUser);
    }

    @Test
    public void testFindFractionAdditionByUserIdUserExist() {
        assertEquals(3.0, fractionOperations.findFractionAdditionByUserId("1"), 1e10-5);
    }

    @Test
    public void testFindFractionAdditionByUserIdUserDoesNotExist() {
        assertEquals(0.0, fractionOperations.findFractionAdditionByUserId("10"));
    }
}