import java.util.ArrayList;

// represents a list of items currently in the fridge that belong to the given people
public class PeopleFridgeList extends ItemList {

  // the people that own the items in this list
  private ArrayList<Person> people;

  // the items in this list
  private ArrayList<Item> items;

  // the money that has been spent on this list
  private double moneySpent;

  public PeopleFridgeList() {
    people = new ArrayList<Person>();
    items = new ArrayList<Item>();
    moneySpent = 0.0;
  }

  /**
   * Returns the items in this List
   * @param person
   * @return
   */
  public ItemList returnPersonItems(People person) {
    return person;
  }
}
