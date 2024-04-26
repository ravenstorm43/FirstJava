package week03.Week03_homework;

public class Calculator {
    String operator;
    AbstractOperation operation;
//    AddOperation addOperation = new AddOperation();
//    SubstractOperation substractOperation = new SubstractOperation();
//    MultiplyOperation multiplyOperation = new MultiplyOperation();
//    DivideOperation divideOperation = new DivideOperation();
    Calculator(AbstractOperation operation) {
        this.operation = operation;
    }
    void setOperation(AbstractOperation operation) {
        this.operation = operation; // operation객체에는 원하는 종류의 연산메소드를 뭐든지 담을 수 있게 되면서 switch문으로 연산자를 구분할 필요가 없어졌다.
    }
    double calculate(int firstNumber, int secondNumber) {
        double result = 0;
        result = operation.operate(firstNumber, secondNumber);
        return result;
    }
//    double calculate(String operator, int firstNumber, int secondNumber) {
//        double result = 0;
//        switch (operator) { // 사칙연산 기호에 맞는 연산 하기
//            case "+":
//                result = addOperation.operate(firstNumber, secondNumber); // 계산용 객체와 메소드를 별도로 만듬으로서 프로그램의 모듈화가 이루어졌다.
//                break;
//            case "-":
//                result = substractOperation.operate(firstNumber, secondNumber);
//                break;
//            case "*":
//                result = multiplyOperation.operate(firstNumber, secondNumber);
//                break;
//            case "/":
//                if (secondNumber == 0) {
//                    System.out.println("0으로 나눌 수 없습니다."); // 0으로 나눗셈을 시도하면 처음으로 이동함
//                    return 0;
//                }
//                result = divideOperation.operate(firstNumber, secondNumber);
//                break;
////            case "%":
////                result = firstNumber % secondNumber;
//        }
//        return result;
//    }
}
