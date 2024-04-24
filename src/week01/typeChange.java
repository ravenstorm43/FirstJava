package week01;

public class typeChange {
    public static void main(String[] args) {
        double doubleNumber = 10.101010;
        float floatNumber = 1.1010f;

        int intNumber;
        intNumber = (int)floatNumber;
        System.out.println("Double Type => " + floatNumber);
        System.out.println("Int Type => " + intNumber);

//        intNumber =  (int)doubleNumber;  // double -> int
//        System.out.println("Double Type => " + doubleNumber);
//        System.out.println("Int Type => " + intNumber);
    }
}
