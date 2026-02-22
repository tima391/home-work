package lab4H;

public class Motorcycle implements IVehicle {
    private String type; // Спортивный / Туристический
    private double engineVolume;

    public Motorcycle(String type, double engineVolume) {
        this.type = type;
        this.engineVolume = engineVolume;
    }

    @Override public void drive() { System.out.println("🏍️ " + type + " мотоцикл несется на заднем колесе!"); }
    @Override public void refuel() { System.out.println("⛽ Бак мотоцикла полон."); }
    @Override public void displayInfo() { System.out.println("Мотоцикл: " + type + ", Объем: " + engineVolume + "см³"); }
}