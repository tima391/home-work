package lab8;

public class MainCafe {
    public static void main(String[] args) {
        Beverage myCoffee = new Syrup(new Milk(new Latte()));
        System.out.println(myCoffee.getDescription() + " | Цена: " + myCoffee.cost());
    }
}
