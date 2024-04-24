package week02;

public class W06 {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        int val = ++a + b--; // 11 + 10, ++a는 전치연산자여서 값 증가가 먼저, b--는 후치연산자여서 값 감소가 나중
        System.out.println(val); // 11 + 10 = 21, a=11, b=9
    }
}
