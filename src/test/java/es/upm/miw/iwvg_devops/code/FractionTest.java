package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FractionTest {

    @Test
    public void testDecimal() {
        Fraction fraction = new Fraction(3, 2);
        assertEquals(1.5, fraction.decimal(), 0.5);
    }
}
