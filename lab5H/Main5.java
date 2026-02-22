package lab5H;

public class Main5 {
    public static void main(String[] args) {
        // 1. Singleton тест
        ConfigurationManager config = ConfigurationManager.getInstance();
        config.setSetting("Language", "RU");
        config.saveToFile();

        // 2. Builder тест
        ReportDirector director = new ReportDirector();
        HtmlReportBuilder htmlBuilder = new HtmlReportBuilder();
        director.construct(htmlBuilder);
        System.out.println(htmlBuilder.getReport());

        // 3. Prototype тест
        Order order1 = new Order();
        order1.products.add(new Product("Молоко", 100));
        order1.payment = "Карта";

        Order order2 = order1.clone();
        order2.payment = "Наличные";

        System.out.println("Оригинал оплата: " + order1.payment);
        System.out.println("Клон оплата: " + order2.payment);
    }
}