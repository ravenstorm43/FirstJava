package week02;

public class W04 {
    public static void main(String[] args) {
        // 논리연산자 &&, || !
        boolean flag1 = true;
        boolean flag2 = true;
        boolean flag3 = false;
        System.out.println(flag1);
        System.out.println(flag2);
        System.out.println(flag3);
        System.out.println("-------------------");

        System.out.println(flag1 || flag2);
        System.out.println(flag1 || flag2 || flag3);
        System.out.println("-------------------");

        System.out.println(flag1 && flag2);
        System.out.println(flag1 && flag2 && flag3);
        System.out.println("AND-------------------");

        System.out.println((5 > 3) && (3 > 1)); // true && true = true
        System.out.println((5 > 3) && (3 < 1)); // true && false = false
        System.out.println("OR-------------------");

        System.out.println((5 > 3) || (3 > 1)); // true && true = true
        System.out.println((5 > 3) || (3 < 1)); // true || false = false
        System.out.println((5 < 3) || (3 < 1)); // false || false = false
        System.out.println("NOT-------------------");

        System.out.println(!flag1); // !true = false
        System.out.println(!flag3); // !false = false
        System.out.println(!(5 == 5)); // !true = false
        System.out.println(!(5 == 3)); // !false = true
    }
}
