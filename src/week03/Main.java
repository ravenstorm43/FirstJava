package week03;

public class Main {
    public static void main(String[] args) {
//        Car car = new Car(); // 객체를 생성하기 위해선 생성자를 호출해야 한다.
//        System.out.println(car); // 참조형 변수는 내용물은 다른 곳에 저장하고 변수에는 저장된 곳의 주소를 저장함.

        Car[] carArray = new Car[3];
        Car car1 = new Car();
        car1.changeGear('P');
        carArray[0] = car1;

        Car car2 = new Car();
        car2.changeGear('N');
        carArray[1] = car2;

        Car car3 = new Car();
        car3.changeGear('D');
        carArray[2] = car3;

        for(Car car : carArray) {
            System.out.println(car.gear);
        }


    }
}