package week03.Week03_homework;

public class MultiplyOperation extends AbstractOperation {
    @Override
    double operate(int firstNumber, int secondNumber) {
        double result = 0;
        result = firstNumber * secondNumber;
        return result;
    }
}
