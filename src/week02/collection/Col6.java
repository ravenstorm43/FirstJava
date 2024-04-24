package week02.collection;

import java.util.HashMap;
import java.util.Map;

public class Col6 {
    public static void main(String[] args) {
        // Map : key - value가 한쌍을 이루는 자료구조
        // 따라서 key가 중복되면 안됨

        Map<String, Integer> intMap = new HashMap<>();

        intMap.put("일", 11); // key-value 입력
        intMap.put("이", 12);
        intMap.put("삼", 13);
        intMap.put("삼", 14); // 중복 key
        intMap.put("삼", 15);

        for (String key: intMap.keySet()) { // keySet() : 키만 추출해서 배열로 만듬
            System.out.println(key); // 중복된 키는 표시안됨
        }

        for (Integer value: intMap.values()) { // values() : 값만 추출해서 배열로 만듬
            System.out.println(value); // 키가 중복되면 가장 나중에 입력된 value로 덮어씀
        }

        System.out.println(intMap.get("삼")); // 특정 키에 해당하는 값 출력
    }
}
