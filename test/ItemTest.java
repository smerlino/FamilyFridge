import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * Contains test for {@link Item} constructors and methods
 */
public class ItemTest {
    Person person1 = new Person("Sarah Lackey");
    People people1 = new People(new ArrayList<Person>(Arrays.asList(person1)));

    Item item1 = new Item(people1, "Pesto", "she left so much pesto when she left", 7.50, 12, true);
    Item item2 = new Item(people1, "Mozzarella Cheese", "delicious", 5.00, 1, false);

    /**
     * Test get functions
     */
    @Test
    public void testGetFunctions() {
        // test getName()
        assertEquals(item1.getName(),
                "Pesto"
        );

        // test getDescription
        assertEquals(item2.getDescription(),
                "delicious");

    }

}
