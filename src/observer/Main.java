package observer;

public class Main {
    public static void main(String[] args) {
        ConcreteObservable observable = new ConcreteObservable();
        for (int i = 0; i < 10; i++) {
            ConcreteObserver observer  = new ConcreteObserver(i);
            observable.addObserver(observer);
        }

        //Notifying all observers
        observable.notifyObservers();
    }
}
