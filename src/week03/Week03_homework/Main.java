package week03.Week03_homework;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(new AddOperation());
        double result = calculator.calculate(7, 4);
        System.out.println(result);
        calculator.setOperation(new MultiplyOperation());
        result = calculator.calculate(7, 4);
        System.out.println(result);
    }
}
