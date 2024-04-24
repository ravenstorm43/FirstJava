package week02;

public class W10 {
    public static void main(String[] args) {
        //비트 연산자 <<(왼쪽으로 비트이동), >>(오른쪽으로 비트이동)
        // <<은 2^n만큼 곱하기와 같음
        // >>은 2^n만큼 나누기와 같음
        System.out.println(3 << 2); // 0011 -> 1100 = 12
        System.out.println(3 << 1); // 0011 -> 0110 = 6
    }
}
