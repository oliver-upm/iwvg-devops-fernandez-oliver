package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SearchesTest {

    @Test
    void testFindFirstProperFractionByUserId() {
        assertEquals(0, new Searches().findFirstProperFractionByUserId("1").getNumerator());
        assertEquals(1, new Searches().findFirstProperFractionByUserId("1").getDenominator());

        assertNull(new Searches().findFirstProperFractionByUserId("4"));
    }

}
