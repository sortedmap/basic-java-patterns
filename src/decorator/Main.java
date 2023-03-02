package decorator;

public class Main {
    public static void main(String[] args) {
        SedanCar sedan = new SedanCar();
        SportCar sportCar = new SportCar(sedan);
        sportCar.switchTurboOn();
        System.out.println(sportCar.getMaxSpeed());
    }
}
