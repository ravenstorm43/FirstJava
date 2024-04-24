package week02.array;

public class Arr05 {
    // String 기능 예시
    public static void main(String[] args) {
        String str = "ABCD";

        int strLength = str.length(); // 문자열의 길이 반환
        System.out.println(strLength);

        char strChar = str.charAt(1); // 문자열의 특정 위치의 문자 하나 반환
        System.out.println(strChar);

        String strSub = str.substring(0, 3); // 시작 지점과 끝 지점을 정해서 정해진 만큼의 문자열을 추출
        System.out.println(strSub);

        String newStr = "ABCD";
        boolean strEqual = newStr.equals(str); // 문자열 간의 비교
        System.out.println(strEqual);

        char[] strCharArray = str.toCharArray(); // String을 char배열로 변환
    }
}
