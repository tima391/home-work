package lab7H;

public class TempCommand implements ICommand {
    private Thermostat thermostat;
    private int prevTemp;

    public TempCommand(Thermostat t) { this.thermostat = t; }

    @Override
    public void execute() {
        prevTemp = thermostat.getTemperature();
        thermostat.setTemperature(prevTemp + 1);
    }

    @Override
    public void undo() {
        thermostat.setTemperature(prevTemp);
    }
}