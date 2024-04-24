package week02.collection;

import java.util.Stack;

public class Col3 {
    public static void main(String[] args) {
        Stack<Integer> intStack = new Stack<Integer>();

        intStack.push(10); // 스택의 끝에 데이터 입력
        intStack.push(15);
        intStack.push(1);

        while(!intStack.isEmpty()) { // 스택에 데이터가 비어있는지 확인
            System.out.println(intStack.pop()); // 스택의 데이터를 출력하고 삭제하기
        } // 스택은 끝에서만 데이터의 입력, 삭제가 가능

        System.out.println(intStack.peek()); // 가장 끝에있는 값 출력
        System.out.println(intStack.size()); // 스택의 사이즈 출력
    }
}
