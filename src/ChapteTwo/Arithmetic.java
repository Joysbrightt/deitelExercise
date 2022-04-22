package ChapteTwo;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber, secondNumber;

        System.out.println("Enter an integer: ");
        firstNumber = scanner.nextInt();

        System.out.println("Enter another integer: ");
        secondNumber = scanner.nextInt();

        int squareFirstNumber = firstNumber * firstNumber;
        int squareSecondNumber = secondNumber * secondNumber;

        int difference = squareFirstNumber - squareSecondNumber;
        System.out.println("The square of the first number is: " +squareFirstNumber);
        System.out.println("The square of the second number is: " + squareSecondNumber);
        System.out.println("The differences of the two square numbers is: " +difference);

    }
}
