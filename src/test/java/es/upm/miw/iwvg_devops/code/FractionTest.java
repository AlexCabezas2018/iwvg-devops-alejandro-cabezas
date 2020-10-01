package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FractionTest {

    @Test
    void testEmptyConstructor() {
        Fraction fraction = new Fraction();
        assertEquals(1.0, fraction.decimal(), 1e10-5);
    }

    @Test
    void testSetNumerator() {
        Fraction fraction = new Fraction();
        fraction.setNumerator(2);
        assertEquals(2.0, fraction.decimal(), 1e10-5);
    }

    @Test
    void testSetDenominator() {
        Fraction fraction = new Fraction();
        fraction.setDenominator(2);
        assertEquals(1.5, fraction.decimal(), 1e10-5);
    }

    @Test
    void testDecimal() {
        Fraction fraction = new Fraction(3, 2);
        assertEquals(1.5, fraction.decimal(), 10e-5);
    }

    @Test
    void testIsEquivalent() {
        Fraction fraction1 = new Fraction(1, 2);
        Fraction fraction2 = new Fraction(2, 4);
        assertTrue(fraction1.isEquivalent(fraction2));
    }

    @Test
    void testIsProperWhenItShould() {
        Fraction fraction = new Fraction(2, 3);
        assertTrue(fraction.isProper());
    }

    @Test
    void testIsNotProperWhenItShould() {
        Fraction fraction = new Fraction(3, 2);
        assertFalse(fraction.isProper());
    }

    @Test
    void testIsImproperWhenItShould() {
        Fraction fraction = new Fraction(3, 2);
        assertTrue(fraction.isImproper());
    }

    @Test
    void testIsNotImproperWhenItShould() {
        Fraction fraction = new Fraction(2, 3);
        assertFalse(fraction.isImproper());
    }

    @Test
    void testMultiply() {
        Fraction fraction1 = new Fraction(3, 2);
        Fraction fraction2 = new Fraction(2, 1);
        Fraction multipliedFraction = fraction1.multiply(fraction2);

        assertEquals(3.0, multipliedFraction.decimal(), 10e-5);
    }

    @Test
    void testDivide() {
        Fraction fraction1 = new Fraction(3, 2);
        Fraction fraction2 = new Fraction(3, 2);
        Fraction dividedFraction = fraction1.divide(fraction2);

        assertEquals(1.0, dividedFraction.decimal(), 10e-5);
    }

    @Test
    void testEqualsWhenOneOfThemIsNotFraction() {
        Fraction fraction1 = new Fraction();
        assertFalse(fraction1.equals("4"));
    }
}
