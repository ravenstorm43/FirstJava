package week03.extendsExample;

// 자식 클래스
// 부모의 형질(필드, 메소드)를 물려받은 클래스
public class SportsCar extends Car{ // extends : 상속
    String engine;
    public void booster() {
        System.out.println("엔진 " + engine + " 부앙~\n");
    }
}
