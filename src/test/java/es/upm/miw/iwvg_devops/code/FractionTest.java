package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FractionTest {

    @Test
    public void testDecimal() {
        Fraction fraction = new Fraction(3, 2);
        assertEquals(1.5, fraction.decimal(), 10e-5);
    }

    @Test
    public void testIsProperWhenItShould() {
        Fraction fraction = new Fraction(2, 3);
        assertTrue(fraction.isProper());
    }

    @Test
    public void testIsNotProperWhenItShould() {
        Fraction fraction = new Fraction(3, 2);
        assertFalse(fraction.isProper());
    }

    @Test
    public void testIsImproperWhenItShould() {
        Fraction fraction = new Fraction(3, 2);
        assertTrue(fraction.isImproper());
    }

    @Test
    public void testIsNotImproperWhenItShould() {
        Fraction fraction = new Fraction(2, 3);
        assertFalse(fraction.isImproper());
    }

    @Test
    public void testMultiply() {
        Fraction fraction1 = new Fraction(3, 2);
        Fraction fraction2 = new Fraction(2, 1);
        Fraction multipliedFraction = fraction1.multiply(fraction2);

        assertEquals(3.0, multipliedFraction.decimal(), 10e-5);
    }

    @Test
    public void testDivide() {
        Fraction fraction1 = new Fraction(3, 2);
        Fraction fraction2 = new Fraction(3, 2);
        Fraction dividedFraction = fraction1.divide(fraction2);

        assertEquals(1.0, dividedFraction.decimal(), 10e-5);
    }

}
