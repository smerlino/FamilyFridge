import java.util.ArrayList;

/**
 * Represents a list of grocery items.
 */
public abstract class ItemList {

    /**
     * The people that this list belongs to
     */
    private People owners;

    /**
     * The items that are in this list
     */
    private ArrayList<Item> items;

    /**
     * default constructor that takes the owners of the list and initializes the list of items
     * to be an empty list
     */

    public ItemList() {
        this.owners = new People();
        this.items = new ArrayList<Item>();
    }

    /**
     * Removes the given person from the owners of this list if they exist. If not, then no change
     * is made.
     */
    public void removeOwner(Person toRemove) {
        this.owners.remove(toRemove);
    }

    /**
     * Adds the given person to be an owner of this list.
     */
    public void addOwner(Person toAdd) {
        this.owners.add(toAdd);
    }
}