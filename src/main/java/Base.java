import Numbers.FirstNumber;
import Numbers.SecondNumber;
import Operations.Operations;
import Operations.*;
import java.util.Scanner;

public class Base {
    public static void main(String[] args) {
        Scanner firstNumberin = new Scanner(System.in);
        System.out.println("Введите первое число:");
        FirstNumber x = new FirstNumber(firstNumberin.nextDouble());
        Scanner secondNumberin = new Scanner(System.in);
        System.out.println("Введите второе число:");
        SecondNumber y = new SecondNumber(secondNumberin.nextDouble());
        Scanner operationin = new Scanner(System.in);
        System.out.println("Введите знак знак арифметического действия:");
        String operation = operationin.nextLine();
        switch (operation) {
            case "+":
                Operations addition = new Addition();
                break;
            case "-":
                System.out.printf("x - y = %.4f%n");
                break;
            case "*":
                System.out.printf("x * y = %.4f%n");
                break;
            case "/":
                    System.out.printf("x / y = %.4f%n" );
                break;

    }


    }
}
