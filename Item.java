// Item.java

public class Item {
    private String name;
    private double price;
    private int quantity;

    // Constructor to initialize item details
    public Item(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters for item properties
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // Calculate total price for this item based on quantity
    public double getTotalPrice() {
        return price * quantity;
    }
}
