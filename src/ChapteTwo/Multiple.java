package ChapteTwo;

import java.util.Scanner;

public class Multiple {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int firstNumber, secondNumber;

        System.out.println("Enter an integer: ");
        firstNumber = scanner.nextInt();


        System.out.println("Enter an integer: ");
        secondNumber = scanner.nextInt();

        int squareFirstNumber = firstNumber * firstNumber;
        if(squareFirstNumber % secondNumber == 0){
            System.out.println("Square of first number is a multiple of second number");
        }
        else{
            System.out.println("Square of first number is not a multiple of second number");
        }


    }
}
