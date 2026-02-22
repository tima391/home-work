package lab4H;

public class Truck implements IVehicle {
    private double capacity;
    private int axles;

    public Truck(double capacity, int axles) {
        this.capacity = capacity;
        this.axles = axles;
    }

    @Override public void drive() { System.out.println("🚛 Грузовик везет " + capacity + " тонн груза."); }
    @Override public void refuel() { System.out.println("⛽ Залито 200 литров дизеля."); }
    @Override public void displayInfo() { System.out.println("Грузовик: " + capacity + "т, Оси: " + axles); }
}
