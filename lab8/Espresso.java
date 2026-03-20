package lab8;

public class Espresso implements Beverage {
    public String getDescription() { return "Эспрессо"; }
    public double cost() { return 500.0; }
}

class Latte implements Beverage {
    public String getDescription() { return "Латте"; }
    public double cost() { return 800.0; }
}