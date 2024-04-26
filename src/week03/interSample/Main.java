package week03.interSample;

public class Main {
    public static void main(String[] args) {

        // A 인터페이스에 구현체 B 대입
        A a1 = new B(); // B클래스 -> A인터페이스로 자동 형변환
        a1.a();
        // a1.b(); // b()는 A인터페이스에 없는 기능이므로 불가능

        System.out.println("\nB 강제 타입변환");
        B b = (B) a1; // a1은 하위 클래스인 B생성자로 선언한 인터페이스여서 B클래스로 강제 형변환 가능
        b.a();
        b.b(); // B클래스로 강제 타입변환 당했기에 사용 가능
        System.out.println();

        // C클래스는 사실상 A인터페이스를 채택하고 B클래스를 상속받은 존재
        // A 인터페이스에 구편체 B를 상속받은 C 대입
        A a2 = new C(); // C클래스 -> A인터페이스로 자동 형변환
        a2.a();
        //a2.b(); //  b()는 A인터페이스에 없는 기능이므로 불가능
        //a2.c(); //  c()는 A인터페이스에 없는 기능이므로 불가능

        System.out.println("\nC 강제 타입변환");
        C c = (C) a2;
        c.a();
        c.b(); // 강제 타입변환으로 사용 가능
        c.c(); // 강제 타입변환으로 사용 가능


    }
}

interface A {
    void a();
}
class B implements A {
    @Override
    public void a() {
        System.out.println("B.a()");
    }

    public void b() {
        System.out.println("B.b()");
    }
}
class C extends B {
    public void c() {
        System.out.println("C.c()");
    }
}
