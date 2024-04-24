package week01;

public class Valuetype {
    public static void main(String[] args) {
        boolean flag = true;
        flag = false;

        System.out.println(flag);
        char alphabet = 'A'; // char(1byte) 문자 한개 저장
        System.out.println(alphabet);

        byte byteNumber = 127; // byte(1byte) -128~127
        short shortNumber = 32767; // short(2byte) -32768~32767
        int intNumber = 2147483647; // int(4byte) -2147483648~2147483647
        long longNumber = 2147483647L; // long(8byte) int에 비해 매우 넓은 범위,
        // int 리터럴과 구분하기 위해 접미사 L(대소문자 관계없음)붙임

        System.out.println(byteNumber);
        System.out.println(shortNumber);
        System.out.println(intNumber);
        System.out.println(longNumber);

        float floatNumber = 0.123F; // float(4byte) 소수점 7자리까지 표현가능
        // double 리터럴과 구분하기 위해 접미사 F(대소문자 관계없음)붙임
        double doubleNumber = 0.123123132; // double(8byte) 소수점 15자리까지 표현가능

        System.out.println(floatNumber);
        System.out.println(doubleNumber);
    }
}
