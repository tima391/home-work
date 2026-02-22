package lab4H;

public class MotorcycleFactory extends VehicleFactory {
    private String type;
    private double vol;
    public MotorcycleFactory(String t, double v) { this.type = t; this.vol = v; }

    @Override public IVehicle createVehicle() { return new Motorcycle(type, vol); }
}
