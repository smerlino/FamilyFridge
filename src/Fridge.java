import java.util.ArrayList;

// The state of the current "fridge"
public class Fridge {
  // all members of this fridge
  private ArrayList<Person> people;

  // all lists of items in this fridge with their associated persons
  private ArrayList<PeopleFridgeList> allLists;

  public Fridge() {
    people = new ArrayList<Person>();
    allLists = new ArrayList<PeopleFridgeList>();
  }

  public void addPerson(Person newPerson) {
    if (people.contains(newPerson)) {
      throw new IllegalArgumentException("This person already exists!");
    }
    else {
      people.add(newPerson);
    }
  }

  public void removePerson(Person toRemove) {
    if (!people.contains(toRemove)) {
      throw new IllegalArgumentException("This person is not in the fridge!");
    }
    else {
      people.remove(toRemove);
      for (int i = 0; i < allLists.size(); i ++) {
        allLists.get(i).removePerson(toRemove);
      }
    }
  }

}
