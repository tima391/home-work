package lab6H;

public interface ISubject {
    void register(IObserver o);
    void unregister(IObserver o);
    void notifyObservers();
}