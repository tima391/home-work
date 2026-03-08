package lab7H;

import java.util.Stack;

public class Invoker {
    private Stack<ICommand> history = new Stack<>();

    public void execute(ICommand command) {
        command.execute();
        history.push(command);
    }

    public void undo() {
        if (history.isEmpty()) {
            System.out.println("Ошибка: Нет команд для отмены.");
            return;
        }
        history.pop().undo();
    }
}