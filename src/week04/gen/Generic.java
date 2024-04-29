package week04.gen;

// 1. 제네릭은 클래스 혹은 메소드에 사용 가능
// <>안에 들어가야할 타입을 명시
public class Generic<T> { // // 여기서 자료형이 들어가야 할 T는 '타입 변수'라고 한다.
    // 2.
    private T t;
    // 3.
    public T get() {
        return this.t;
    }

    public void set(T t) {
        this.t = t;
    }

    public static void main(String[] args) {
        // 4.
        Generic<String> stringGeneric = new Generic<>(); // <>안에 String을 넣으면 Generic클래스의 모든 T형은 String형으로 취급함
        // 5.
        stringGeneric.set("Hello World");

        String tValueTurnOutWithString = stringGeneric.get();

        System.out.println(tValueTurnOutWithString);
    }
}