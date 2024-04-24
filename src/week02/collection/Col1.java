package week02.collection;

import java.util.ArrayList;

public class Col1 {
    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<Integer>();

        intList.add(99); // ArrayList의 맨 끝에 값 입력
        intList.add(15);
        intList.add(3); // {99, 15, 3}

        System.out.println(intList.get(1)); // 15 특정 인덱스의 값 읽기

        intList.set(1, 10); // {99, 10, 3} 특정 인덱스에 값 입력
        System.out.println(intList.get(1)); // 10

        intList.remove(0); // {10, 3} 특정 인덱스의 값 제거
        System.out.println(intList.get(0)); // 10

        System.out.println(intList.toString());
        intList.clear(); // ArrayList의 모든 값 제거
        System.out.println(intList.toString());
    }
}
