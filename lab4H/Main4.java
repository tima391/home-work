package lab4H;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VehicleFactory factory = null;

        System.out.println("--- Система управления транспортом ---");
        System.out.println("Выберите тип: 1-Авто, 2-Мото, 3-Грузовик");
        int choice = sc.nextInt();
        sc.nextLine(); // Очистка буфера

        if (choice == 1) {
            System.out.print("Марка: "); String b = sc.nextLine();
            System.out.print("Модель: "); String m = sc.nextLine();
            System.out.print("Топливо: "); String f = sc.nextLine();
            factory = new CarFactory(b, m, f);
        } else if (choice == 2) {
            System.out.print("Тип (Sport/Tour): "); String t = sc.nextLine();
            System.out.print("Объем: "); double v = sc.nextDouble();
            factory = new MotorcycleFactory(t, v);
        } else if (choice == 3) {
            System.out.print("Грузоподъемность (т): "); double c = sc.nextDouble();
            System.out.print("Осей: "); int a = sc.nextInt();
            factory = new TruckFactory(c, a);
        }

        if (factory != null) {
            IVehicle vehicle = factory.createVehicle();
            System.out.println("\n--- Результат работы фабрики ---");
            vehicle.displayInfo();
            vehicle.drive();
            vehicle.refuel();
        } else {
            System.out.println("Ошибка выбора!");
        }
    }
}