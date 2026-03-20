package lab8;

public class Milk extends BeverageDecorator {
    public Milk(Beverage beverage) { super(beverage); }
    @Override
    public String getDescription() { return wrappedBeverage.getDescription() + ", Молоко"; }
    @Override
    public double cost() { return wrappedBeverage.cost() + 150.0; }
}

class Syrup extends BeverageDecorator {
    public Syrup(Beverage beverage) { super(beverage); }
    @Override
    public String getDescription() { return wrappedBeverage.getDescription() + ", Сироп"; }
    @Override
    public double cost() { return wrappedBeverage.cost() + 100.0; }
}