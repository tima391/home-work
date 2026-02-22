package lab4H;

public class TruckFactory extends VehicleFactory {
    private double capacity;
    private int axles;

    public TruckFactory(double capacity, int axles) {
        this.capacity = capacity;
        this.axles = axles;
    }

    @Override
    public IVehicle createVehicle() {
        return new Truck(capacity, axles);
    }
}