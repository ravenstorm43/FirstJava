package week02;

public class W12 {
    public static void main(String[] args) {
        boolean flag = true;
        int number = 2;
        
        if (flag) {
            System.out.println("flag가 true입니다.");
            if (number == 1) {
                System.out.println("flag값은 true고 number값은 1입니다.");
            } else if (number == 2) {
                System.out.println("flag값은 true고 number값은 2입니다.");
            } else {
                System.out.println("flag값은 true고 number값은 모르겠습니다.");
            }
        } else {
            if (number == 1) {
                System.out.println("flag값은 true고 number값은 1입니다.");
            } else if (number == 2) {
                System.out.println("flag값은 true고 number값은 2입니다.");
            } else {
                System.out.println("flag값은 true고 number값은 모르겠습니다.");
            }
        }
    }
}
