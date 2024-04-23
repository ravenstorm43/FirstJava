public class typeChange2 {
    public static void main(String[] args) {
        // 자료형 표현 범위
        // byte(1byte) => short(2byte) => int(4byte) => long(8byte) => float(4byte) => double(8byte)

        byte byteNumber = 10;
        int intNumber = byteNumber; // byte -> int 암묵적 형변환됨
        System.out.println(intNumber);

        char charAlphabet = 'A';
        intNumber = charAlphabet; // char -> int로 암묵적 형변환됨
        System.out.println(intNumber);

        intNumber = 100;
        long longNumber = intNumber; // int -> long로 암묵적 형변환됨
        System.out.println(longNumber);

        intNumber = 200;
        double doubleNumber = intNumber; // int -> dobule로 암묵적 형변환됨
        System.out.println(doubleNumber);

        // 표현 범위가 작은 자료형에서 큰 자료형(차지하는 메모리가 작은 것에서 큰 것)으로 바뀔때 자동으로 형 변환됨
        // 변수에 할당하는것 말고도 두 변수끼리 연산할 때도 자료형에 따라 암묵적 형변환됨

        int intNum = 10;
        double doubleNum = 5.5;
        double result = intNum + doubleNum;

        System.out.println("plus => " + result);

        int iResult = intNum / 4; // 정수간 연산이기에 소수점은 버리고 저장함
        double dResult = intNum / 4.0; // 정수와 실수간 연산이기에 표현 범위가 작은 정수가 실수로 암묵적 형변환됨

        System.out.println(iResult + " / " + dResult);
    }
}
