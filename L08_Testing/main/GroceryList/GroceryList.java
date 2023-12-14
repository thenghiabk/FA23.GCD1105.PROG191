package L09_Testing.GroceryList;

import java.util.Arrays;

public class GroceryList {
    private static final int MAX_ITEMS = 10;
    private GroceryItemOrder[] items;
    private int size;

    public GroceryItemOrder[] getItems( ) {
        return items;
    }

    public void setItems( GroceryItemOrder[] items ) {
        this.items = items;
    }

    public int getSize( ) {
        return size;
    }

    public void setSize( int size ) {
        this.size = size;
    }

    // Constructs a new empty grocery list
    public GroceryList() {
        items = new GroceryItemOrder[MAX_ITEMS];
        size = 0;
    }

    // Adds the given item order to this list if the list has fewer than 10 items
    public void add(GroceryItemOrder item) {
        if (size < MAX_ITEMS) {
            items[size++] = item;
        }
    }

    // Returns the total sum cost of all grocery item orders in this list
    public double getTotalCost() {
        double totalCost = 0;
        for (int i = 0; i < size; i++) {
            totalCost += items[i].getCost();
        }
        return totalCost;
    }

    @Override
    public String toString() {
        return "GroceryList{" +
                "items=" + Arrays.toString(Arrays.copyOfRange(items, 0, size)) +
                ", size=" + size +
                '}';
    }
}


