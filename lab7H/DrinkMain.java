package lab7H;

public class DrinkMain {
    public static void main(String[] args) {
        Beverage tea = new Tea();
        tea.prepare();

        System.out.println();

        Beverage coffee = new Coffee();
        coffee.prepare();
    }
}