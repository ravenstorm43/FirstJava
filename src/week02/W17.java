package week02;

import java.util.Scanner;

public class W17 {
    public static void main(String[] args) {
        // 구구단 만들기
        // 입력받은 단만 제외하고 출력하기
        Scanner sc = new Scanner(System.in);
        int passNum = sc.nextInt();

        for (int i = 2; i <= 9; i++) {
            if (i == passNum) {
                continue;
            }
            for (int j = 1; j <= 9; j++){
                System.out.println(i + " * " + j + " = " + i*j);
            }
        }
    }
}
