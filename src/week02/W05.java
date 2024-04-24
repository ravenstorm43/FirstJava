package week02;

public class W05 {
    public static void main(String[] args) {
        // 대입연산자 =(기본대입연산자), +=, -=, *= ...(복합대입연산자)
        // ++(+= 1), --(-= 1)

        int number = 10;
        number = number + 2; // 12
        System.out.println(number);

        number = number - 2;
        System.out.println(number); // 10

        number = number * 2;
        System.out.println(number); // 20

        number = number / 2;
        System.out.println(number); // 10

        number = number % 2;
        System.out.println(number); // 0
        System.out.println("----------------");

        number = 10;

        number += 2; // number = number + 2
        System.out.println(number); // 12

        number -= 2; // number = number - 2
        System.out.println(number); // 10

        number *= 2; // number = number * 2
        System.out.println(number); // 20

        number /= 2; // number = number / 2
        System.out.println(number); // 10

        number %= 2; // number = number % 2
        System.out.println(number); // 0
        System.out.println("----------------");

        number++; // number = number + 1 -> number += 1 -> number++
        System.out.println(number);

        number--; // number = number - 1 -> number -= 1 -> number--
        System.out.println(number);
    }
}
