package lab7H;

public class LightCommand implements ICommand {
    private Light light;
    private boolean previousState;

    public LightCommand(Light light) { this.light = light; }

    @Override
    public void execute() {
        light.on();
        previousState = true;
    }

    @Override
    public void undo() {
        light.off();
        previousState = false;
    }
}