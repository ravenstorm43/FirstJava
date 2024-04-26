package week03.Week03_homework;

public class DivideOperation extends AbstractOperation {
    @Override
    double operate(int firstNumber, int secondNumber) {
        double result = 0;
        result = (double) firstNumber / secondNumber;
        return result;
    }
}
