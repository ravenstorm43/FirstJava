package week03;

public class Car {
    // 클래스를 만들려면 4(3)가지의 과정이 필요하다.
    // 1. 클래스 선언
    // 2. 필드(속성 선언)
    // 3. 생성자 선언(생략 가능)
    // 4. 메소드 선언

    // 필드 선언
    // 고유 데이터 영역
    String company; //제조사
    String model = "Gv80"; // 모델
    // 필드는 객체가 생성될 때 초기값을 별도로 지정할 수 있다.
    // 초기값을 별도로 지정하지 않으면 0, null등 자동으로 초기화한다.
    String color; // 색깔
    double price; // 가격
    // 상태 데이터 영역
    double speed; // 속도(km/h)
    char gear; // 기어 상태(P, R, N, D)
    boolean lights = true; // 조명상태

    //객체 데이터 영역
    Tire tire = new Tire();
    Door door;
    Handle handle;

    //객체가 처음 생성될때(인스턴스화 될때) 어떤 로직을 수행해야 하며,
    // 어떤 값이 필수로 들어가야 하는지 정의
    public Car() {
        // 아무것도 안쓰면 기본생성자여서 아무 로직도 실행 안함(생략 가능)
        System.out.println("생성자 호출");
    }

    // 메소드 선언
    double gasPedal(double kmh, char type) {
        changeGear(type); // 가속도 폐달을 사용할 때 기어 변경
        speed = kmh;
        return speed; // 객체 내부 메소드에서 내부의 필드 접근 (권장)
    }
    double breakPedal() {
        speed = 0;
        return speed;
    }
    char changeGear(char type) {
        gear = type;
        return gear;
    }
    boolean onOffLights() {
        lights = !lights;
        return lights;
    }
    void horn() {
        System.out.println("빵빵!");
    }
    void carSpeeds(double ... speeds) { // 가변 길이의 매개변수, double형의 값이 몇개가 오든 상관없음
        for (double v : speeds) {
            System.out.println("v = " + v);
        }
    }
}
