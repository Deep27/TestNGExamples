package sample03;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class CustomAssertionTest {

    @Test
    public void testListEmptiness() {
        List<Integer> intsList = new ArrayList<Integer>();
        ListAssertion listAssertion = new ListAssertion(intsList);
        // то же, что и assertTrue(intsList.size() > 0)
        listAssertion.assertNotNull();
        listAssertion.assertNotEmpty();
        listAssertion.assertSizeIs(50);
    }
}
