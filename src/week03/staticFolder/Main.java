package week03.staticFolder;

public class Main {
    public static void main(String[] args) {
        // 클래스 필드 company 확인
        System.out.println(Car.company + "\n");
        // 클래스 필드 변경 및 확인
        Car.company = "Audi";
        System.out.println(Car.company + "\n");

        // 클래스 메서드 호출
        String companyName = Car.setCompany("Benz");
        System.out.println("companyName = " + companyName);

        System.out.println();
        // 참조형 변수 사용
        Car car = new Car(); // 객체 생성

        // 인스턴스에서 클래스 멤버나 메소드를 호출할 수도 있음(권장하지 않음)
        car.company = "Ferrari";
        System.out.println(car.company + "\n");

        String companyName2 = car.setCompany("Lamborghini"); // 클래스 멤버를 바꾸면 모든 인스턴스의 클래스 멤버의 값이 바뀜
        System.out.println("companyName2 = " + companyName2);
    }
}
