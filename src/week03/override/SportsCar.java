package week03.override;

public class SportsCar extends Car{
    String engine;
    public void booster() {
        System.out.println("엔진 " + engine + " 부앙~\n");
    }

    public SportsCar(String engine) {
        this.engine = engine;
    }

    @Override // 부모 클래스에 있는 동명의 메소드와는 다른 기능의 메소드를 새로 정의함
    public double brakePedal() {
        speed = 100; // speed의 값이 0이 아닌 100으로 바뀜
        System.out.println("스포츠카에 브레이크란 없다");
        return speed;
    }

    @Override
    public void horn() {
        booster();
    }
}
