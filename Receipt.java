// Receipt.java

import java.util.ArrayList;

public class Receipt {
    private int id;
    private Store store;
    private Customer customer;
    private ArrayList<Item> items;
    private double totalAmount;
    private Payment paymentMethod;

    // Constructor to initialize a receipt with required details
    public Receipt(int id, Store store, Customer customer, Payment paymentMethod) {
        this.id = id;
        this.store = store;
        this.customer = customer;
        this.paymentMethod = paymentMethod;
        this.items = new ArrayList<>();
    }

    // Getter for the receipt ID
    public int getId() {
        return id;
    }

    // Method to add an item to the receipt and update the total
    public void addItem(Item item) {
        items.add(item);
        calculateTotal();
    }

    // Calculate the total amount of the receipt
    private void calculateTotal() {
        totalAmount = 0;
        for (Item item : items) {
            totalAmount += item.getTotalPrice();
        }
    }

    // Getter for the total amount of the receipt
    public double getTotalAmount() {
        return totalAmount;
    }

    // Getter for the store where the receipt was issued
    public Store getStore() {
        return store;
    }

    // Getter for the customer associated with the receipt
    public Customer getCustomer() {
        return customer;
    }

    // Getter for the payment method used in the receipt
    public Payment getPaymentMethod() {
        return paymentMethod;
    }

    // Getter for the list of items in the receipt
    public ArrayList<Item> getItems() {
        return items;
    }

    // Print the receipt details
    public void printReceipt() {
        System.out.println("Receipt ID: " + id);
        System.out.println("Store: " + store.getName());
        System.out.println("Customer: " + customer.getName());
        System.out.println("Items Purchased:");
        for (Item item : items) {
            System.out.println("- " + item.getName() + ": $" + item.getPrice() + " x " + item.getQuantity() + " = $" + item.getTotalPrice());
        }
        System.out.println("Total Amount: $" + totalAmount);
        System.out.println("Payment Method: " + paymentMethod.getType());
    }
}
