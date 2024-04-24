package week02;

public class W07 {
    public static void main(String[] args) {
        int intNumber = 93 + (int)98.8; // 93 + 98 = 191
        System.out.println(intNumber);

        double doubleNumber = (double) 93 + 98.8; // 93.0 + 98.8 = 191.8
        System.out.println(doubleNumber);

        int x = 1;
        int y = 9;

        boolean b = (x == y) ? true : false; // false
        System.out.println(b);

        String s = (x != y) ? "정답" : "오답"; // 정답
        System.out.println(s);

        int max = (x > y) ? x : y; // 9
        System.out.println(max);

        int min = (x < y) ? x : y; // 1
        System.out.println(min);

        // instance of = 피연산자가 조건에 명시된 클래스의 객체인지 비교 a instance of A -> a는 A에서 만든 인스턴스니?
    }
}
