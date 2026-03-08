package lab7H;

import java.util.Scanner;

public class Coffee extends Beverage {
    @Override
    void brew() { System.out.println("Пропускание воды через кофе..."); }

    @Override
    void addCondiments() { System.out.println("Добавление молока и сахара."); }

    @Override
    boolean customerWantsCondiments() {
        System.out.print("Хотите добавить молоко/сахар в кофе? (y/n): ");
        Scanner in = new Scanner(System.in);
        String answer = in.nextLine();
        return answer.toLowerCase().startsWith("y");
    }
}