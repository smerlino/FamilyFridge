import java.util.ArrayList;

/**
 * Represents a group of {@link Person}s who may share an ItemList
 */
public class People {
    private ArrayList<Person> personArrayList;
    private ShoppingList shoppingList;

  /**
   * Initializes a People with the empty arraylist of Person, and empty shoppingList and fridgeList
   */
  public People() {
    this.personArrayList = new ArrayList<Person>();
    this.shoppingList = new ShoppingList();
    this.fridgeList = new PeopleFridgeList();
  }

  /**
   * Initializes a People with the given arraylist of Person, and empty shoppingList and fridgeList
   *
   * @param personArrayList the Persons in this group of people
   */
  public People(ArrayList<Person> personArrayList) {
    this.personArrayList = personArrayList;
    this.shoppingList = new ShoppingList();
    this.fridgeList = new PeopleFridgeList();
  }

  public ShoppingList returnShoppingList() {
    return this.shoppingList;
  }

  public PeopleFridgeList returnFridgeList() {
    return this.fridgeList;
  }

  public void remove(Person person) {
    this.personArrayList.remove(person);
  }

  public void add(Person person) { this.personArrayList.add(person); }
}
