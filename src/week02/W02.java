package week02;

public class W02 {
    public static void main(String[] args) {
        System.out.println(4 + 2); // 6
        System.out.println(4 - 2); // 2
        System.out.println(4 * 2); // 8
        System.out.println(4 / 2); // 2
        System.out.println(5 / 2); // 2 정수여서 소수점은 버림
        System.out.println(2 / 4); // 0
        System.out.println(4 % 2); // 0
        System.out.println(5 % 2); // 1
        System.out.println("-------------------------");

        System.out.println(2 + 2 * 2); // 6
        System.out.println((2 + 2) * 2); // 8 자바에서도 괄호안을 우선순위로 연산함
        System.out.println(2 + (2 * 2)); // 6

        int a = 20;
        int b = 10;
        int c;

        c = a + b;
        System.out.println(c); // 30

        c = a - b;
        System.out.println(c); // 10

        c = a * b;
        System.out.println(c); // 200

        c = a / b;
        System.out.println(c); // 2

        c = a % b;
        System.out.println(c); // 0
    }
}
