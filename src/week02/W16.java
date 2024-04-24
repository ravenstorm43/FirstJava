package week02;

public class W16 {
    public static void main(String[] args) {
        // while문
        // while(조건문) {   }
        int number = 0;
        while (number < 3) { //number < 3 동안 반복
            number++;
            System.out.println(number + "출력!");
        }

        // do while문, do-while문은 while문 안의 코드가 최소 한번은 실행된다.
        int number1 = 4;
        do {
            System.out.println(number1 + "출력!"); // number1은 이미 4여서 조건이 안맞음에도 한번 실행되서 4출력! 이 출력된다.
        } while (number1 < 3);

        //break: 가장 가까운 블록의 for문, while문, switch문을 중단
        int number2 = 0;
        while (number2 < 3) {
            number2++;
            if (number2 == 2) {
                break; // number2가 2가 되면 while문 탈출, 1출력! 출력하고 종료
            }
            System.out.println(number2 + "출력!!");
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("i: " + i);
            if(i == 2) {
                break; // i: 2 출력하고 for문 탈출
            }
            for (int j = 0; j < 10; j++) {
                System.out.println("j: " + j);
                if (j == 2) {
                    break; //j: 0, j: 1, j: 2 출력하고 for문 탈출
                }
            }
        }

        int number3 = 0;
        while (number3 < 3) {
            number3++;
            if (number3 == 2) {
                continue; // number3이 2가 되면 continue 아래는 실행하지 않고 다시 반복문 최상단 코드부터 실행함
            }
            System.out.println(number3 + "출력!"); // 2출력!은 나오지 않음
        }
    }
}
