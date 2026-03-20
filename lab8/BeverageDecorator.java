package lab8;

public abstract class BeverageDecorator implements Beverage {
    protected Beverage wrappedBeverage;
    public BeverageDecorator(Beverage beverage) { this.wrappedBeverage = beverage; }
    public String getDescription() { return wrappedBeverage.getDescription(); }
    public double cost() { return wrappedBeverage.cost(); }
}
