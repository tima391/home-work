package lab6H;

class CreditCardPayment implements IPaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Оплачено " + amount + " руб. с банковской карты.");
    }
}

class PayPalPayment implements IPaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Оплачено " + amount + " руб. через PayPal.");
    }
}

class CryptoPayment implements IPaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Оплачено " + amount + " руб. криптовалютой.");
    }
}
