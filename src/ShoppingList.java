import java.util.ArrayList;
import java.util.List;

/**
 * Represents a shopping list.
 */
public class ShoppingList extends ItemList{
    private ArrayList<Item> items;

    /**
     * Initializes this ShoppingList with no items.
     */
    public ShoppingList() {
        this.items = new ArrayList<Item>();
    }

    /**
     * Initializes a ShoppingList with the given parameters.
     * @param items Items to be added to the shopping list
     */
    public ShoppingList(ArrayList<Item> items) {
        this.items = items;
    }

    /**
     * Adds an Item to this ShoppingList.
     * @param item item to be added
     */
    void addItem(Item item) {
        this.items.add(item);
    }

    /**
     * Adds all Items in list to this ShoppingList.
     * @param itemList list of items to be added
     */
    void addList(List<Item> itemList) {
        this.items.addAll(itemList);
    }
}
