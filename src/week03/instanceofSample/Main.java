package week03.instanceofSample;

public class Main {
    // 다형성

    class Parent { }
    class Child extends Parent { }
    class Brother extends Parent { }
    public static void main(String[] args) {

//        Parent pc = new Child();  // 다형성 허용 (자식 -> 부모)
//
//        Parent p = new Parent();
//
//        System.out.println(p instanceof Object); // p는 Object 클래스의 인스턴스인가? true 출력
//        System.out.println(p instanceof Parent); // true 출력
//        System.out.println(p instanceof Child);  // false 출력
//        // instanceof는 어떤 클래스의 인스턴스인지 확인하는 명령어이다.
//        Parent c = new Child();
//
//        System.out.println(c instanceof Object); // true 출력
//        System.out.println(c instanceof Parent); // true 출력
//        System.out.println(c instanceof Child);  // true 출력

    }
}
