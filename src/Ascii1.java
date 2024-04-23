import java.util.Scanner;

public class Ascii1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char letter = sc.nextLine().charAt(0); //문자열을 입력받는데 charAt(0)함수로 문자열의 첫 번째 값만 입력받음
        int asciNumber = (int)letter;

        System.out.println(asciNumber);
    }
}
