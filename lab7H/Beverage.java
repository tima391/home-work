package lab7H;

import java.util.Scanner;

public abstract class Beverage {
    public final void prepare() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    private void boilWater() { System.out.println("Кипячение воды..."); }
    private void pourInCup() { System.out.println("Наливание в чашку..."); }

    abstract void brew();
    abstract void addCondiments();

    boolean customerWantsCondiments() {
        return true;
    }
}
