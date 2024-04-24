package week02.collection;

import java.util.LinkedList;

public class Col2 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();

        linkedList.add(5); // linkedlist 맨 끝에 값 추가
        linkedList.add(10);
        linkedList.add(3);

        System.out.println(linkedList.get(0)); // 0번째 데이터 읽기
        System.out.println(linkedList.get(1)); //1번째 데이터 읽기
        System.out.println(linkedList.get(2));

        System.out.println(linkedList.toString()); // 전체 데이터를 조회하는 속도가 ArrayList보다 느리다

        linkedList.add(200);
        System.out.println(linkedList.toString()); // 전체 데이터 읽기

        linkedList.add(2, 4); //특정 노드에 값을 추가하기
        System.out.println(linkedList.toString()); // 데이터를 추가하거나 삭제하는 속도가 빠르다

        linkedList.set(1, 30); // 이미 존재하는 노드의 값을 수정하기
        System.out.println(linkedList.toString());

        linkedList.remove(1); // 원하는 노드 삭제
        System.out.println(linkedList.toString());

        linkedList.clear(); // linkedlist의 모든 데이터 지우기
        System.out.println(linkedList.toString());
    }

}
