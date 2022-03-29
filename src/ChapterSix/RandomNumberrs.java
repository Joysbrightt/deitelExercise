package ChapterSix;

import java.security.SecureRandom;
import java.util.Scanner;

public class RandomNumberrs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SecureRandom secureRandom = new SecureRandom();
        int countCorrectInput = 0;

        System.out.println("Welcome to your random operation Test");

        for (int i = 1; i <= 10; i++){
            int firstNumber = 1+ secureRandom.nextInt(20);
            int secondNumber = 1+ secureRandom.nextInt(10);
            int operation = 1+ secureRandom.nextInt(4);
            int userInput;

            System.out.println("Hey");

            switch (operation) {
                case 1 -> {
                    System.out.printf("What is:  %d * %d ", firstNumber, secondNumber);
                    userInput = scanner.nextInt();
                    if (userInput == firstNumber * secondNumber) {
                        countCorrectInput++;
                    }
                }
                case 2 -> {
                    System.out.printf("What is: %d/ %d ", firstNumber, secondNumber);
                    userInput = scanner.nextInt();
                    if (userInput == firstNumber / secondNumber) {
                        countCorrectInput++;
                    }
                }
                case 3 -> {
                    System.out.printf("What is: %d + %d ", firstNumber, secondNumber);
                    userInput = scanner.nextInt();
                    if (userInput == firstNumber + secondNumber) {
                        countCorrectInput++;
                    }
                }
                case 4 -> {
                    System.out.printf("What is: %d - %d ", firstNumber, secondNumber);
                    userInput = scanner.nextInt();
                    if (userInput == firstNumber - secondNumber) {
                        countCorrectInput++;
                    }
                }
            }

        }
        System.out.println("correctInput: " +countCorrectInput);
        System.out.println("incorrectInput: " +(10 - countCorrectInput));

    }
}
