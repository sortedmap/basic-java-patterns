package observer;

import java.util.ArrayList;
import java.util.List;

class ConcreteObservable implements Observable
{
    private List<Observer> observers;

    public ConcreteObservable() {
        observers = new ArrayList<>();
    }

    public void addObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    public void notifyObservers() {
        observers.forEach(Observer::handle);
    }
}