package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FractionTest {

    private Fraction fraction;

    @BeforeEach
    void before() {
        fraction = new Fraction(2, 3);
    }

    @Test
    void testFractionIntInt() {
        assertEquals(2, fraction.getNumerator());
        assertEquals(3, fraction.getDenominator());
    }

    @Test
    void testPoint() {
        fraction = new Fraction();
        assertEquals(1, fraction.getNumerator());
        assertEquals(1, fraction.getDenominator());
    }

    @Test
    void testSetters() {
        fraction.setNumerator(4);
        fraction.setDenominator(5);
        assertEquals(4, fraction.getNumerator());
        assertEquals(5, fraction.getDenominator());
    }

    @Test
    void testDecimal() {
        assertEquals(0.666667, fraction.decimal(), 10e-5);
    }

    @Test
    void testIsProper() {
        assertTrue(fraction.isProper());
        assertFalse(new Fraction(3, 2).isProper());
        assertFalse(new Fraction(4, 4).isProper()); // Unit fraction
    }

    @Test
    void testIsImproper() {
        assertFalse(fraction.isImproper());
        assertTrue(new Fraction(3, 2).isImproper());
        assertFalse(new Fraction(4, 4).isImproper()); // Unit fraction
    }

    @Test
    void testIsEquivalent() {
        assertTrue(fraction.isEquivalent(new Fraction(4, 6)));
        assertFalse(fraction.isEquivalent(new Fraction(4, 5)));
    }

    @Test
    void testAdd() {
        Fraction fraction2 = new Fraction(1, 4);
        Fraction result = fraction.add(fraction2);
        assertEquals(11, result.getNumerator());
        assertEquals(12, result.getDenominator());
    }

    @Test
    void testMultiply() {
        Fraction fraction2 = new Fraction(1, 4);
        Fraction result = fraction.multiply(fraction2);
        assertEquals(2, result.getNumerator());
        assertEquals(12, result.getDenominator());
    }

    @Test
    void testDivide() {
        Fraction fraction2 = new Fraction(1, 4);
        Fraction result = fraction.divide(fraction2);
        assertEquals(8, result.getNumerator());
        assertEquals(3, result.getDenominator());
    }

    @Test
    public void testToString() {
        String expected = "Fraction{" +
                "numerator=" + fraction.getNumerator() +
                ", denominator=" + fraction.getDenominator() +
                '}';
        assertEquals(expected, fraction.toString());
    }
}
