package week02;

public class W09 {
    public static void main(String[] args) {
        short x = 10;
        int y = 20;

        int z = x + y; // short -> int 자동 형변환

        long lx = 30L;
        long lz = z + lx; // int -> long 자동 형변환

        float fx = x; // short, int -> float 자동 형변환
        float fy = y;
        float fz = z;

        System.out.println(lz);
        System.out.println(fx);
        System.out.println(fy);
        System.out.println(fz);
    }
}
