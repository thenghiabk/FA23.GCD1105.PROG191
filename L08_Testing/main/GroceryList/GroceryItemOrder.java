package L09_Testing.GroceryList;

public class GroceryItemOrder {
    private String name;
    private int quantity;
    private double pricePerUnit;

    // Constructs an item order to purchase the item with the given name, in the given quantity, which costs the given price per unit.
    public GroceryItemOrder(String name, int quantity, double pricePerUnit) {
        this.name = name;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
    }

    // Returns the total cost of this item in its given quantity
    public double getCost() {
        return quantity * pricePerUnit;
    }

    // Sets this grocery item’s quantity to be the given value
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "GroceryItemOrder{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                ", pricePerUnit=" + pricePerUnit +
                ", cost=" + getCost() +
                '}';
    }
}