import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class PersonTest {

    // Simulação de assertNotEqual (isso não existe realmente em JUnit 4)
    private void assertNotEqual(Object a, Object b) {
        if (a.equals(b)) {
            fail("Expected objects to be not equal, but they were equal.");
        }
    }

    @Test
    public void testPersonsNotEqualUsingAssertNotEqual() {
        Person person1 = new Person("John", 25);
        Person person2 = new Person("John", 25);

        // Isto falharia, pois person1 é igual a person2
        assertNotEqual(person1, person2);
    }

    @Test
    public void testStringsNotEqualUsingAssertThat() {
        String str1 = "hello";
        String str2 = "world";

        // Isto passaria, pois str1 não é igual a str2
        assertThat(str1, not(equalTo(str2)));
    }

    @Test
    public void testListsNotEqualUsingAssertThat() {
        List<String> list1 = Arrays.asList("one", "two", "three");
        List<String> list2 = Arrays.asList("four", "five", "six");

        // Isto passaria, pois list1 não é igual a list2
        assertThat(list1, not(equalTo(list2)));
    }
}
