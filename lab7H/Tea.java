package lab7H;

public class Tea extends Beverage {
    @Override
    void brew() { System.out.println("Заваривание чая..."); }

    @Override
    void addCondiments() { System.out.println("Добавление лимона."); }
}
