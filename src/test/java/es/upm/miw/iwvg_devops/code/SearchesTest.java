package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.stream.Collectors;

class SearchesTest {

    @Test
    void testFindFirstProperFractionByUserId() {
        assertEquals(0, new Searches().findFirstProperFractionByUserId("1").getNumerator());
        assertEquals(1, new Searches().findFirstProperFractionByUserId("1").getDenominator());

        assertNull(new Searches().findFirstProperFractionByUserId("4"));
    }

    @Test
    void testFindUserFamilyNameInitialBySomeProperFraction() {
        assertEquals(List.of("F", "B", "L", "B"), new Searches().findUserFamilyNameInitialBySomeProperFraction().collect(Collectors.toList()));
    }

    @Test
    void testFindDecimalFractionByUserName() {
        assertEquals(List.of(0.0, 1.0, 2.0, 0.2, -0.5, 0.5, 1.0), new Searches().findDecimalFractionByUserName("Oscar").collect(Collectors.toList()));
        assertEquals(List.of(2.0, -0.2, 0.5, 1.3333333333333333), new Searches().findDecimalFractionByUserName("Ana").collect(Collectors.toList()));

    }

}
