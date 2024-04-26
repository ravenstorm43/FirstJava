package week03.thisFolder;

public class Car {

    static final String COMPANY = "GENESIS"; // 자동차 회사 : GENESIS
    String model; // 자동차 모델
    String color; // 자동차 색상
    double price; // 자동차 가격

    double speed;  // 자동차 속도 , km/h
    char gear = 'P'; // 기어의 상태, P,R,N,D
    boolean lights; // 자동차 조명의 상태

    Tire tire = new Tire();
    Door door = new Door();
    Handle handle = new Handle();

    public Car(String model) {
        this(model, "Blue", 50000000);
    }
    // this() : 객체 자기자신의 생성자
    // 오버로딩을 할 때 코드의 중복을 방지하기 위해 사용함
    public Car(String model, String color) {
        this(model, color, 100000000);
    }
    // 이 생성자를 호출하면 아래의 매개변수 3개짜리 생성자를 호출함

    public Car(String model, String color, double price) {
        this.model = model; // this : 객체 자기자신
        this.color = color; // 객체 자기 자신의 필드 color에 매개변수 color를 저장
        this.price = price; // 메소드 지역변수의 이름과 객체의 필드 변수의 이름을 구분하기 위해 사용
    }

    double gasPedal(double kmh, char type) {
        changeGear(type);
        speed = kmh;
        return speed;
    }

    double brakePedal() {
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
        System.out.println("빵빵");
    }

    Car returnInstance() {
        return this;
    }
}