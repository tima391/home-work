package lab8;

public class StripePaymentAdapter implements IPaymentProcessor {
    private StripePaymentService service;
    public StripePaymentAdapter(StripePaymentService service) { this.service = service; }
    public void processPayment(double amount) { service.makeTransaction(amount); }
}