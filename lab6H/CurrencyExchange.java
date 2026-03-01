package lab6H;

import java.util.ArrayList;
import java.util.List;

public class CurrencyExchange implements ISubject {
    private List<IObserver> observers = new ArrayList<>();
    private double rate;

    public void setRate(double rate) {
        this.rate = rate;
        notifyObservers();
    }

    @Override
    public void register(IObserver o) { observers.add(o); }
    @Override
    public void unregister(IObserver o) { observers.remove(o); }
    @Override
    public void notifyObservers() {
        for (IObserver o : observers) o.update(rate);
    }
}
