import static org.junit.Assert.*;

import org.junit.Test;

public class StringTest {

    @Test
    public void testAssertSame() {
        String x = "ola";
        String y = "ola ";

        assertSame(x, y);
    }

    @Test
    public void testAssertNotSame() {
        String x = "ola";
        String y = "olx";

        assertNotSame(x, y);
    }

    @Test
    public void testStringsAssertTrue() {
        String str1 = "hello";
        String str2 = "hello";

        // Isto passaria, pois str1 não é igual a str2
        assertTrue(str1 == str2);
    }


    @Test
    public void testStringsAssertFalse() {
        String str1 = "banana";
        String str2 = "cenoura";

        // Isto passaria, pois list1 não é igual a list2
        assertFalse(str1 == str2);
    }

    @Test
    public void testStringAssertEquals() {
        String str1 = "ola";
        String str2 = "ola";

        assertEquals(str1, str2);
    }

    @Test
    public void testStringAssertNotEquals() {
        String str1 = "ola";
        String str2 = "uva";
        assertNotEquals(str1, str2);
    }
}
