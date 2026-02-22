package lab5H;

public class Main5 {
    public static void main(String[] args) {
        ConfigurationManager config = ConfigurationManager.getInstance();
        config.setSetting("Language", "RU");
        config.saveToFile();

        ReportDirector director = new ReportDirector();
        HtmlReportBuilder htmlBuilder = new HtmlReportBuilder();
        director.construct(htmlBuilder);
        System.out.println(htmlBuilder.getReport());

        Order order1 = new Order();
        order1.products.add(new Product("Молоко", 100));
        order1.payment = "Карта";

        Order order2 = order1.clone();
        order2.payment = "Наличные";

        System.out.println("Оригинал оплата: " + order1.payment);
        System.out.println("Клон оплата: " + order2.payment);
    }

}
