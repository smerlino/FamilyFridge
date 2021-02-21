/**
 * Class representing items in the Fridge
 */
public class Item {
    private People owner;
    private String name;
    private String description;
    private double price;
    private int quantity;
    private boolean isInFridge;
    private boolean isPurchased;

    public Item(People owner, String name) {
        this.owner = owner;
        this.name = name;
        this.description = "";
        this.price = 0.0;
        this.quantity = 1;
        this.isInFridge = false;
    }

    public Item(People owner, String name, String description, double price, int quantity) {
        this.owner = owner;
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.isInFridge = false;
    }

    /**
     * Initializes an Item with the given parameters
     *
     * @param owner     People who own the Item
     * @param name      Name of the item, e.g: "Oatmilk"
     * @param description   Short description of the item or comments on item
     * @param price         Price the item was puchased at
     * @param quantity      Number of that item in the Fridge
     * @param isInFridge    True if there are any of this item in the FridgeList,
     *                      false if it only exists in a ShoppingList
     */
    public Item(People owner, String name, String description, double price, int quantity, boolean isInFridge) {
        this.owner = owner;
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.isInFridge = isInFridge;
    }

    /**
     * Changes {@param owner} of this Item, replacing it with the given People
     */
    void changeOwner(People newOwner) {
        this.owner = newOwner;
    }

    /**
     * Edits {@param description} of this Item, replacing it with the given string
     */
    void editDescription(String newDescription) {
        this.description = newDescription;
    }

    /**
     * Edits {@param price} of this Item, replacing it with the given double
     */
    void editPrice(double newPrice) {
        this.price = newPrice;
    }

    /**
     * Edits {@param quantity} of this Item, replacing it with the given int
     */
    void editQuantity(int newQuantity) {
        this.quantity = newQuantity;
    }

    /**
     * Marks Item as purchased by changing {@param isInFridge} to true
     */
    void markPurchased() {
        this.isInFridge = true;
    }

    /**
     * Returns the value of this Item's {@param name}
     */
    String getName() {
        return this.name;
    }

    /**
     * Return the value of this Item's {@param description}
     */
    String getDescription() {
        return this.description;
    }

    /**
     * Returns the value of the {@param price} of this Item
     */
    double getPrice() {
        return this.price;
    }

    /**
     * Returns the value of the {@param quantity} of this Item that is in the Fridge
     */
    int getQuantity() {
        return this.quantity;
    }

    /**
     * Returns value of this Item's {@param isInFridge}
     */
    boolean getIsInFridge() {
        return this.isInFridge;
    }
}
