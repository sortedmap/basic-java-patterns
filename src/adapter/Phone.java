package adapter;

public class Phone {
    private final static int CHARGE_VOLTAGE = 5;

    public void charge(VoltageAdapter adapter) {
        if (adapter.getVoltage() == CHARGE_VOLTAGE) {
            System.out.println ("можно заряжать");
        } else {
            System.out.println ("зарядка невозможна");
        }
    }
}
