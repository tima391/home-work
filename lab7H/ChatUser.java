package lab7H;

public class ChatUser extends User {
    public ChatUser(IMediator m, String name) {
        super(m, name);
    }

    @Override
    public void send(String msg) {
        System.out.println(this.name + " отправляет: " + msg);
        mediator.sendMessage(msg, this);
    }

    @Override
    public void receive(String msg) {
        System.out.println(this.name + " получил: " + msg);
    }
}
