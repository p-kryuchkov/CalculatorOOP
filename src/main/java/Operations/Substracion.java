package Operations;

import Numbers.Numbers;

public class Substracion implements Operations {

    @Override
    public void showResult(Numbers FirstNumber, Numbers SecondNumber) {
        double firstNumber = FirstNumber.getNumberValue();
        double secondNumber = SecondNumber.getNumberValue();
        StringBuilder result = new StringBuilder();
        result.append(firstNumber + " - " + secondNumber + " = " + (firstNumber - secondNumber));
        System.out.println(result.toString());

    }
}
