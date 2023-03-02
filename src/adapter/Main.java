package adapter;

public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.charge(new Voltage5VAdapter());
    }
}
