package lab4H;
public class Car implements IVehicle {
    private String brand, model, fuelType;

    public Car(String brand, String model, String fuelType) {
        this.brand = brand;
        this.model = model;
        this.fuelType = fuelType;
    }

    @Override public void drive() { System.out.println("🚗 Автомобиль " + brand + " едет по шоссе."); }
    @Override public void refuel() { System.out.println("⛽ Заправка " + fuelType + " завершена."); }
    @Override public void displayInfo() { System.out.println("Машина: " + brand + " " + model); }
}