import java.util.ArrayList;

/**
 * represents a list of items currently in the fridge that belong to the given people
 */
public class PeopleFridgeList extends ItemList {
  /**
   * the money that has been spent on this list
   */
  private double moneySpent;

  /**
   * Generic constructor that initializes the people, items, and moneySpent to empty/zero
   *
   */
  public PeopleFridgeList() {
    super();
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
