package week02.array;

import java.util.Arrays;

public class Arr04 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int[] b = Arrays.copyOf(a, a.length); // a의 값만 그대로 복사해서 새로운곳에 저장함

        a[3] = 0;
        System.out.println(a[3]);
        System.out.println(b[3]);
    }
}
