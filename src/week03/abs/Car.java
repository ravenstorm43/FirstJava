package week03.abs;

public abstract class Car {
    // 추상 클래스는 자식 클래스의 공통된 부분을 모아 정의한 미완성된 클래스이다.
    // 추상 클래스는 단독으로는 못쓰고 자식 클래스가 상속받는 것을 통해 사용할 수 있다.
    String company; // 자동차 회사 : GENESIS
    String color; // 자동차 색상
    double speed;  // 자동차 속도 , km/h

    public double gasPedal(double kmh) {
        speed = kmh;
        return speed;
    }

    public double brakePedal() {
        speed = 0;
        return speed;
    }

    public abstract void horn(); // 추상 메소드는 추상 클래스에서만 선언할 수 있다.
    // 추상 메소드는 선언만 해야한다. 내용을 정의할 수는 없다.
}
