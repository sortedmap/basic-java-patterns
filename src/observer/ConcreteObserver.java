package observer;

public class ConcreteObserver implements Observer {
    private int id;

    public ConcreteObserver(int id) {
        this.id = id;
    }

    @Override
    public void handle() {
        System.out.println("handle observer");
    }
}
