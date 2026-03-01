package lab6H;

import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- ТЕСТ СТРАТЕГИИ ---
        System.out.println("=== Тест паттерна Стратегия ===");
        PaymentContext paymentContext = new PaymentContext();

        System.out.println("Выберите оплату: 1-Карта, 2-PayPal, 3-Крипта");
        int choice = scanner.nextInt();

        if (choice == 1) paymentContext.setStrategy(new CreditCardPayment());
        else if (choice == 2) paymentContext.setStrategy(new PayPalPayment());
        else paymentContext.setStrategy(new CryptoPayment());

        paymentContext.executePayment(1000.0);

        System.out.println("\n----------------------------\n");

        // --- ТЕСТ НАБЛЮДАТЕЛЯ ---
        System.out.println("=== Тест паттерна Наблюдатель ===");
        CurrencyExchange exchange = new CurrencyExchange();

        exchange.register(new BankObserver());
        exchange.register(new NewsObserver());
        exchange.register(new BrokerObserver());

        System.out.print("Введите новый курс валют: ");
        double newRate = scanner.nextDouble();
        exchange.setRate(newRate);
    }
}
