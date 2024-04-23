import java.util.Scanner;

public class Ascii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int asciNumber = sc.nextInt(); // 숫자 입력받음
        char ch = (char)asciNumber; // 숫자를 문자로 형변환
        System.out.println(ch);
    }
}
