package week02;

public class W08 {
    public static void main(String[] args) {
        // 연산자 우선순위 : 산술 > 비교 > 논리 > 대입
        int x = 2;
        int y = 9;
        int z = 10;

        boolean result = x < y && y < z; // 1. x<y, 2. y<z 3. &&
        System.out.println(result); // true && true

        result = x + 10 < y && y < z; // 1. x+10, 2. x+10 < y, 3. y<z, 4. &&
        System.out.println(result); // false && true

        result = x + 2 * 3 > y; // 1. 2*3, 2. x+2*3, 3. x+2*3>y
        System.out.println(result);  // false

        result = (x + 2) * 3 > y; // 1. x+2, 2. (x+2)*3, 3. x+2*3>y
        System.out.println(result);  // true
    }
}
