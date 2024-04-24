package week02.collection;

import java.util.LinkedList;
import java.util.Queue;

public class Col4 {
    public static void main(String[] args) {
        Queue<Integer> intQueue = new LinkedList<>(); // queue는 linkedlist의 생성자를 통해 생성
        // queue는 클래스가 아닌 인터페이스여서 별도의 생성자가 없다.
        intQueue.add(1); //큐 맨 끝에 새로운 값 입력
        intQueue.add(5);
        intQueue.add(9);

        while (!intQueue.isEmpty()) {
            System.out.println(intQueue.poll()); //큐 맨 앞의 데이터 출력 후 삭제
        }

        intQueue.add(1); //큐 맨 끝에 새로운 값 입력
        intQueue.add(5);
        intQueue.add(9);
        intQueue.add(10);

        System.out.println(intQueue.peek()); //큐 맨 앞의 데이터 출력
        System.out.println(intQueue.size()); //큐의 사이즈 출력
    }
}
