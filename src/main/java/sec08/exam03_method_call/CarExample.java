package sec08.exam03_method_call;

public class CarExample {
    public static void main(String[] args) {
        Car mycar = new Car();
        mycar.keyTurnOn();
        mycar.run();
        int speed = mycar.getSpeed();
        System.out.println("현재 속도: " + speed + "km/h");
    }


}
