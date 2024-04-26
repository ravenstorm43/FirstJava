package week03.sample;

public class Main {
    public static void main(String[] args) {
        Main main = new Main(); // 클래스 안에서 자기 자신의 인스턴스를 생성하는 것도 가능
        System.out.println(main.getNumber());
        System.out.println(main.getNumber()); // 몇 번을 호출해도 똑같이 2만 출력됨
    }
    public int getNumber() {
        // number는 지역변수 (반의어:전역변수)
        // 이 메소드가 실행될 때 마다 독립적으로 관리됨
        // 지역변수는 메소드 내부에서만 사용할 수 있음
        // 지역변수는 메소드가 종료되면 소멸됨
        int number = 1;
        number += 1;
        return number;
    }
}
