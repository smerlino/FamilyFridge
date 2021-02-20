import java.util.HashMap;

/**
 * Represents a user/person who uses this Fridge
 */
public class Person {
  private int id; //implement later
  private String name;
  private boolean isShopping;
  private HashMap<Person, Double> moneyOwed;
  private HashMap<Person, Double> moneyCollect;

  /**
   * Initializes a Person given a name, where {@param isShopping} is false
   *
   * @param name    represents the name of the Person
   */
  public Person(String name) {
    this.name = name;
    this.isShopping = false;
    this.moneyOwed = new HashMap<>();
    this.moneyCollect = new HashMap<>();
  }

  /**
   * Returns this Person.
   * @return current Person object
   */
  public Person returnPerson() {
    return this;
  }

  /**
   * Updates whether Person is or is not shopping. If Person was shopping, updates to false.
   * If Person was not shopping, updates to true.
   */
  public void updateIsShopping() {
    isShopping = !isShopping;
  }

  /**
   * Adds money this person owes someone. If Person already owes money to that Person,
   * updates amount owed.
   *
   * @param person represents who money is owed to
   * @param payment represents amount of money owed
   */
  public void addOwed(Person person, double payment) {
    updateMap(person, payment, this.moneyOwed);
  }

  /**
   * Adds money this Person should collect from someone. If Person already owes money,
   * updates amount.
   *
   * @param person represents who owes money
   * @param payment represents amount of money owed
   */
  public void addCollect(Person person, double payment) {
    updateMap(person, payment, this.moneyCollect);
  }

  /**
   * Helper method to update the hashmaps contained within this class based on whether or not a key
   * value already exists. Will update a Person
   * @param person represents Person key value
   * @param payment represents payment value
   * @param map represents which hashmap to update
   */
  private void updateMap(Person person, double payment, HashMap<Person, Double> map) {
    if (map.containsKey(person)) {
      double newPayment = map.get(person) + payment;
      map.put(person, newPayment);
    }
    else {
      map.put(person, payment);
    }
  }
}