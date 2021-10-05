package Operations;

import Numbers.Numbers;

public class Segmentation implements Operations {
    @Override
    public void showResult(Numbers FirstNumber, Numbers SecondNumber) {
        double firstNumber = FirstNumber.getNumberValue();
        double secondNumber = SecondNumber.getNumberValue();
        StringBuilder result = new StringBuilder();
        if (secondNumber == 0){
            System.out.println("На ноль делить нельзя");
        }
        else {
            result.append(firstNumber + " / " + secondNumber + " = " + (firstNumber / secondNumber));
            System.out.println(result.toString());
        }

    }
}
