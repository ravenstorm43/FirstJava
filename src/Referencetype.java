import java.util.Arrays;

public class Referencetype {
    public static void main(String[] args) {
        String helloWorld = "Hello world!"; // String형 여러개의 문자를 저장

        System.out.println(helloWorld);

        int[] a = {1, 2, 3}; // 배열
        System.out.println(Arrays.toString(a)); // 배열의 값을 출력하려면 Arrays라이브러리의 toSting메소드 사용

        int number = 21;
        //Integer num = new Integer(number); wrapper클래스, 더 이상 사용되지 않는 선언방식
        // 래퍼 클래스:기본형 변수를 클래스로 랩핑하는 변수
        Integer num = number; // boxing
        System.out.println(num.intValue()); // unboxing
    }
}
