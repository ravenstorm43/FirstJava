package week03;

public class Main2 {
    public static void main(String[] args) {
        Car car = new Car();

        System.out.println("car.gear = " + car.gear); // 객체 외부에서 객체 내부의 필드에 접근(권장하지 않음)
        double speed = car.gasPedal(100, 'D');
        System.out.println("speed = " + speed);

        boolean lights = car.onOffLights();
        System.out.println("lights = " + lights);

        System.out.println();
        System.out.println("car.gear = " + car.gear);

        System.out.println();
        car.carSpeeds(100, 80);
        System.out.println();
        car.carSpeeds(110, 120, 150);
    }
}
