Description of Files:

1.) Item.java
Objective: This class represents an individual item in a receipt. It stores information such as the item’s name, price, and quantity. It also provides a method to calculate the total price of the item based on its quantity.

Methods:
getName(): Returns the name of the item.
getPrice(): Returns the price of the item.
getQuantity(): Returns the quantity of the item.
getTotalPrice(): Calculates and returns the total price for the item (price * quantity).

2.) Customer.java:
Objective: This class represents a customer. It stores the customer's name and a list of receipts associated with the customer. It allows the customer to have multiple receipts and provides methods to retrieve and manage them.

Methods:
getName(): Returns the customer's name.
addReceipt(): Adds a receipt to the customer's list of receipts.
getReceipts(): Returns the list of receipts associated with the customer

3.) Store.java
Objective: This class represents a store. It stores the store's name and a list of receipts issued by the store. It allows the store to generate and store receipts, and provides methods to retrieve all receipts for the store.

Methods:
getName(): Returns the store's name.
addReceipt(): Adds a receipt to the store’s list of receipts.
getReceipts(): Returns the list of receipts associated with the store

 4.) Payment.java :
Objective: This is an abstract class that represents different types of payment methods (e.g., cash, credit card). It defines a common structure for payment methods, with an amount and an abstract method getType(). The actual payment types (like CashPayment or CreditCardPayment) will extend this class and implement the getType() method to return the specific type of payment.

Methods:
getAmount(): Returns the payment amount.
getType(): A method that must be implemented by subclasses to specify the type of payment .

 5.) Receipt.java:
Objective: This class represents a receipt issued by a store to a customer. It stores the receipt's unique ID, the store and customer involved, a list of items in the receipt, the total amount of the receipt, and the payment method used. It also includes methods to calculate the total amount of the receipt and print the receipt details.

Methods:
addItem(): Adds an item to the receipt and recalculates the total amount.
calculateTotal(): Recalculates the total amount for the receipt.
getTotalAmount(): Returns the total amount of the receipt.
getStore(), getCustomer(), getPaymentMethod(), getItems(): Getters for each field.
printReceipt(): Prints out the details of the receipt (items, total amount, payment method).



