package week04.sample01;
// 예외처리 절차
// 1. 일단 실행(try)
// 2. 예외가 발생하면 잡기 (catch)
// 3. 예외가 발생하건 그렇지 않건 실행하기(finally)
public class StudyException {
    public static void main(String[] args) {
        OurClass ourClass = new OurClass();
        try {
            ourClass.thisMethodIsDangerous(); // 일단 실행
        } catch (OurBadException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("우리는 방금 예외를 handling 힜습니다. 정상처리든 예외사항이든 반드시 실행됨");
        }

    }
}
