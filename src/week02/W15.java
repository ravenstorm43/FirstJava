package week02;

public class W15 {
    public static void main(String[] args) {
        // for문
        // (초기값 ; 조건문 ; 증가연산)
        for (int i = 0; i < 4; i++) {
            System.out.println(i + " 번째 출력!");
        }

        // 향상된 for문, 배열을 이용해서 for문을 다룰 때 사용
        int[] numbers = {3, 6, 9, 12, 15};
        for (int number: numbers) {
            System.out.print(number + " ");
        }
    }
}
