package week02.collection;

import java.util.HashSet;
import java.util.Set;

public class Col5 {
    public static void main(String[] args) {
        // Set: 순서가 없고 중복이 없는 데이터 집합
        // set도 queue처럼 인터페이스여서 생성자가 없음
        // Hashset의 생성자를 통해 구현

        Set<Integer> intSet = new HashSet<>();

        intSet.add(1);
        intSet.add(12);
        intSet.add(5);
        intSet.add(9);
        intSet.add(1);
        intSet.add(12);

        for (Integer value: intSet) {
            System.out.println(value); //1 5 9 12
        }  // 중복값은 입력되지 않음

        System.out.println(intSet.contains(2)); // set에 값이 포함된 여부 확인 (boolean으로 리턴)
        System.out.println(intSet.contains(5));
    }
}
