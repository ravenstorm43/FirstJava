package week02.array;

import java.util.Arrays;

public class Arr02 {
    public static void main(String[] args) {
        // 배열 초기화
        int[] intArr = {10, 20, 30, 40, 50}; // 길이: 5인 배열로 초기화
        String[] stringArray = {"a", "b", "c", "d"}; //길이: 4인 배열로 초기화

//        for (int i = 0; i < intArr.length; i++) {
//            intArr[i] = i; //배열의 각 요소에 값을 입력하기
//        }

        for (int i = 0; i < intArr.length; i++) {
            System.out.println(intArr[i]);
        }
        System.out.println("-----------");

        for (int i: intArr) {
            System.out.println(i);
        }

        Arrays.fill(intArr, 1); // 배열의 모든 요소를 같은 값으로 저장

        for (int item: intArr) {
            System.out.println(item);
        }
    }
}
