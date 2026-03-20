package lab8;

public class PayPalPaymentProcessor implements IPaymentProcessor {
    public void processPayment(double amount) {
        System.out.println("Оплата через PayPal: " + amount);
    }
}