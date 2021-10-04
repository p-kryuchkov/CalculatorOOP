package Operations;

import Numbers.Numbers;

public class Multiplication implements Operations {
    @Override
    public void showResult(Numbers FirstNumber, Numbers SecondNumber) {
        double firstNumber = FirstNumber.getNumberValue();
        double secondNumber = SecondNumber.getNumberValue();
       System.out.printf("x * y = %.4f%n", (firstNumber * secondNumber));
    }
}
