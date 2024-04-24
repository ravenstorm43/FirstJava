package week01;

import java.util.Scanner;

public class Firstweek_homework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        float rating = sc.nextFloat(); // nextInt(), nextFloat(), next(), 등등 next계열 메소드는 공백, 개행을 제외한 문자열이나
        //숫자만 입력받음
        sc.nextLine(); // nextLine은 공백과 개행도 입력한걸로 치기 때문에 desc1에 입력하는걸 건너뛰는 현상을 막으려면
        // sc.nextLine()을 한번 호출해 엔터키로 개행한 것을 날리고 다시 입력받아야함
        String desc1 = sc.nextLine();
        String desc2 = sc.nextLine();
        String desc3 = sc.nextLine();
        String desc4 = sc.nextLine();
        String desc5 = sc.nextLine();
        String desc6 = sc.nextLine();
        String desc7 = sc.nextLine();
        String desc8 = sc.nextLine();
        String desc9 = sc.nextLine();
        String desc10 = sc.nextLine();


        int intRating = (int) rating;
        double ratingPercent = intRating * 100 / 5 ;

        System.out.println("[" + name + "]");
        System.out.println("별점 : " + intRating + " (" + ratingPercent + "% )");
        System.out.println("1. " + desc1);
        System.out.println("2. " + desc2);
        System.out.println("3. " + desc3);
        System.out.println("4. " + desc4);
        System.out.println("5. " + desc5);
        System.out.println("6. " + desc6);
        System.out.println("7. " + desc7);
        System.out.println("8. " + desc8);
        System.out.println("9. " + desc9);
        System.out.println("10. " + desc10);
    }
}