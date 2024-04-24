package week02.array;

public class Arr01 {
    public static void main(String[] args) {
        int[] intArray = new int[3]; // {0, 0, 0}으로 초기화
        boolean[] boolArray = new boolean[3]; // {false, false, false}으로 초기화
        String[] stringArray = new String[3]; // {"", "", ""}으로 초기화

        int[] intArray2; // 배열이 선언만 됨
        intArray2 = new int[3]; // {0, 0, 0}으로 초기화

        // 생성한 배열 '순회'(하나씩 조회)하기
        // 단건 조회
        System.out.println(intArray[1]);
        System.out.println("-----------");

        // 다건 조회
        // length : 길이를 구하는 메서드
        for (int i = 0; i < intArray2.length; i++) {
            System.out.println(intArray2[i]);
        }
    }
}
