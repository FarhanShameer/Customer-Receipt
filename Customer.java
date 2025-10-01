// Customer.java

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Receipt> receipts;

    // Constructor to initialize a customer with a name
    public Customer(String name) {
        this.name = name;
        this.receipts = new ArrayList<>();
    }

    // Getter for the customer's name
    public String getName() {
        return name;
    }

    // Method to add a receipt to the customer's record
    public void addReceipt(Receipt receipt) {
        receipts.add(receipt);
    }

    // Getter for the list of receipts
    public ArrayList<Receipt> getReceipts() {
        return receipts;
    }
}
