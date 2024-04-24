package week01;

public class typeChange1 {
    public static void main(String[] args) {
        int intNumber = 10;

        double doubleNumber = (double)intNumber;
        float floatNumber = (float)intNumber;

        System.out.println("intNumber => " + intNumber); // intNumber => 10
        System.out.println("doubleNumber => " + doubleNumber); // doubleNumber => 10.0
        System.out.println("floatNumber => " + floatNumber); // floatNumber => 10.0
    }
}
