package lab3H;

public class Order {
    private final String productName;
    private final int quantity;
    private final double price;

    public Order(String productName, int quantity, double price) {
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public int getQuantity() { return quantity; }
    public double getPrice() { return price; }
}

class OrderCalculator {
    public double calculateTotalPrice(Order order) {
        return order.getQuantity() * order.getPrice() * 0.9;
    }
}

class PaymentProcessor {
    public void processPayment(String paymentDetails) {
        System.out.println("Payment processed using: " + paymentDetails);
    }
}

class NotificationServiceForOrder { // Переименовал, чтобы не было конфликта с файлом NotificationService.java
    public void sendConfirmationEmail(String email) {
        System.out.println("Confirmation email sent to: " + email);
    }
}