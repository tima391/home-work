package lab8;

public class MainAdapter {
    public static void main(String[] args) {
        IPaymentProcessor processor = new StripePaymentAdapter(new StripePaymentService());
        processor.processPayment(1200.0);
    }
}