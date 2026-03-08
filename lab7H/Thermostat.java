package lab7H;

public class Thermostat {
    private int temperature = 22;

    public void setTemperature(int t) {
        this.temperature = t;
        System.out.println("Термостат: " + temperature + "°C");
    }

    public int getTemperature() { return temperature; }
}
