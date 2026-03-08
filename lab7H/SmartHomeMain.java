package lab7H;

public class SmartHomeMain {
    public static void main(String[] args) {
        Invoker remote = new Invoker();
        Light lamp = new Light();

        remote.execute(new LightCommand(lamp));
        remote.undo();
    }
}
