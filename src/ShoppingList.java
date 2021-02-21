import java.util.ArrayList;
import java.util.List;

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


}
