// Payment.java

public abstract class Payment {
    protected double amount;

    // Abstract method to get the type of payment
    public abstract String getType();

    // Getter for the payment amount
    public double getAmount() {
        return amount;
    }
}
