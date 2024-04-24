package week02.array;

public class Arr03 {
    public static void main(String[] args) {
        // 얕은 복사
        // 배열 변수에는 배열의 첫 번째 요소의 주소값이 저장됨
        int[] a = {1, 2, 3, 4};
        int[] b = a; // int 배열 타입의 변수 b에는 a의 주소가 그대로 저장됨

        b[0] = 3; // a[0]과 b[0]은 본질적으로 같은 곳을 가리킴

        System.out.println(a[0]);
    }
}
