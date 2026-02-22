package lab5H;

public class Product implements Cloneable {
    public String name;
    public double price;
    public Product(String n, double p) { this.name = n; this.price = p; }
    @Override
    public Product clone() { return new Product(name, price); }
}