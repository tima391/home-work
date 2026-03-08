package lab7H;

public abstract class User {
    protected IMediator mediator;
    protected String name;

    public User(IMediator m, String name) {
        this.mediator = m;
        this.name = name;
    }

    public abstract void send(String msg);
    public abstract void receive(String msg);
}
