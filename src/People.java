import java.util.ArrayList;

/**
 * Represents a group of {@link Person}s who may share an ItemList
 */
public class People {
    private ArrayList<Person> personArrayList;
    private ShoppingList shoppingList;

    /**
     * Initializes a People with the given parameters
     *
     * @param personArrayList the Persons in this group of people
     *
     */
    public People(ArrayList<Person> personArrayList) {
        this.personArrayList = personArrayList;
        this.shoppingList = new ShoppingList();
    }
}
