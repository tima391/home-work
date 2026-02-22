package lab5H;

import java.util.*;

public class Order implements Cloneable {
    public List<Product> products = new ArrayList<>();
    public String payment;

    @Override
    public Order clone() {
        Order copy = new Order();
        copy.payment = this.payment;
        for (Product p : this.products) copy.products.add(p.clone()); // Глубокое копирование
        return copy;
    }
}