package adapter;

public class Voltage5VAdapter extends Socket implements VoltageAdapter{

    @Override
    public int getVoltage() {
        int srcVoltage = output();
        return srcVoltage / 44;
    }
}
