// Store.java

import java.util.ArrayList;

public class Store {
    private String name;
    private ArrayList<Receipt> receipts;

    // Constructor to initialize a store with a name
    public Store(String name) {
        this.name = name;
        this.receipts = new ArrayList<>();
    }

    // Getter for the store's name
    public String getName() {
        return name;
    }

    // Method to add a receipt to the store's record
    public void addReceipt(Receipt receipt) {
        receipts.add(receipt);
    }

    // Getter for the list of receipts
    public ArrayList<Receipt> getReceipts() {
        return receipts;
    }
}
