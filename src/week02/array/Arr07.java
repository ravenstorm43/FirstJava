package week02.array;

public class Arr07 {
    public static void main(String[] args) {
        int[][] array = new int[3][];

        array[0] = new int[2]; // 다차원 배열의 배열 원소마다 다른 크기로 지정 가능
        array[1] = new int[4];
        array[2] = new int[1];

        int[][] array2 = {
                {10, 20},
                {10, 20, 30, 40},
                {10}
        }; //중괄호로 배열 원소마다 서로 다른 사이즈의 다차원 배열 초기화도 가능
    }
}
