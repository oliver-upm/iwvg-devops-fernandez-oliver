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
    public void testToString() {
        String expected = "Fraction{" +
                "numerator=" + fraction.getNumerator() +
                ", denominator=" + fraction.getDenominator() +
                '}';
        assertEquals(expected, fraction.toString());
    }
}
