package lab4H;

public class CarFactory extends VehicleFactory {
    private String brand, model, fuel;
    public CarFactory(String b, String m, String f) { this.brand = b; this.model = m; this.fuel = f; }

    @Override public IVehicle createVehicle() { return new Car(brand, model, fuel); }
}