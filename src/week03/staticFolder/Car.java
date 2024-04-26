package week03.staticFolder;

public class Car {
    static String company = "GENESIS"; // 자동차 회사 : GENESIS
    // 클래스 필드는 인스턴스화 하지 않아도 사용 가능
    String model; // 자동차 모델
    String color; // 자동차 색상
    double price; // 자동차 가격

    double speed;  // 자동차 속도 , km/h
    char gear; // 기어의 상태, P,R,N,D
    boolean lights; // 자동차 조명의 상태


    public Car() {} // 기본 생성자

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

    String getCompany() {
        return "(주)" + company;
    }

    // 클래스 메소드도 인스턴스화 하지 않고 사용 가능
    // 단, 클래스 메소드 안에는 클래스 필드만 들어가야함
    static String setCompany(String companyName) {
        // System.out.println("자동차 모델 확인: " + model); // 인스턴스 필드 사용 불가
        company = companyName;
        return company;
    }
}