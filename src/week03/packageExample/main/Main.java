package week03.packageExample.main;

import week03.packageExample.pk1.Car; // 이 패키지의 클래스를 import하면 앞으로 Car클래스는 week03.packageExample.pk1.Car클래스로 간주함
// 같은 이름의 클래스는 한개만 import할 수 있음

public class Main {
    // package는 클래스의 일부분으로 클래스를 식별해주는 용도로 사용된다.
    // 지금 week3패키지 안에는 수많은 Car 클래스가 있는데 이걸 구분하려면 올바른 패키지 이름을 명시해야 한다.
    // 클래스의 일부분이며, 하위 패키지를 도트로 구분한다.
    public static void main(String[] args) {
//        week03.packageExample.pk1.Car car1 = new week03.packageExample.pk1.Car();
//        week03.packageExample.pk2.Car car2 = new week03.packageExample.pk2.Car();
//
//        car1.horn();
//        car2.horn();

        // import는 다른 패키지에 있는 클래스를 사용하기 위해 명시하는 키워드
        Car car = new Car();
        car.horn();
    }
}
