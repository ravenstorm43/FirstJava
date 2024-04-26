package week03.poly;

public class Main {
    public static void main(String[] args) {
        // 매개변수 다형성 확인!
        Car car1 = new Car(new KiaTire("KIA"));
        // 원래는 Tire형 객체를 매개변수로 받아야 하지만
        // KiaTire형 객체를 Tire로 형변환되어 저장됨
        Car car2 = new Car(new HankookTire("HANKOOK"));

        // 반환타입 다형성 확인!
        Tire hankookTire = car1.getHankookTire();
        KiaTire kiaTire = (KiaTire) car2.getKiaTire();
        // KiaTire의 생성자로 선언된 Tire 객체를
        // KiaTire로 강제 형변환함

        // 오버라이딩된 메서드 호출
        car1.tire.rideComfort(); // KIA 타이어 승차감은 60
        car2.tire.rideComfort(); // HANKOOK 타이어 승차감은 100
    }
}
