import java.util.ArrayList;

/**
 * The state of the current "fridge."
 */
public class Fridge {
  // all members of this fridge
  private ArrayList<Person> people;

  // all lists of items in this fridge with their associated person
  private ArrayList<PeopleFridgeList> allLists;

  /**
   * Initializes a Fridge with no members and no lists.
   */
  public Fridge() {
    this.people = new ArrayList<Person>();
    this.allLists = new ArrayList<PeopleFridgeList>();
  }

  /**
   * Adds the given {@param newPerson} to the Fridge {people} if they are not already in it
   *
   * @param newPerson   the {@param Person} being added
   */
  public void addPerson(Person newPerson) {
    if (people.contains(newPerson)) {
      throw new IllegalArgumentException("This person already exists!");
    }
    else {
      people.add(newPerson);
    }
  }

  /**
   * Removes the gives {@param toRemove} Person from the Fridge {people} if they exist
   *
   * @param toRemove                    {@link Person} to remove
   * @throws IllegalArgumentException   if {@param toRemove} is not in thie Fridge's {people}
   */
  public void removePerson(Person toRemove) {
    if (!people.contains(toRemove)) {
      throw new IllegalArgumentException("This person is not in the fridge!");
    }
    else {
      people.remove(toRemove);
      for (int i = 0; i < allLists.size(); i ++) {
        allLists.get(i).removePersonFromList(toRemove);
      }
    }
  }

}