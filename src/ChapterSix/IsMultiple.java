package ChapterSix;

import java.util.Scanner;

public class IsMultiple {

//        Scanner scanner = new Scanner(System.in);

    private static int firstNumber() {
        return firstNumber();
    }

    public static int firNumber() {
        Scanner scanner = new Scanner(System.in);
        return firstNumber();
    }


    private static int seconNumber() {

        return secondNumber();
    }

    public static int secondNumber() {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();

        return firstNumber();
    }

    public static void multipleOfTheTwoNumbers() {
        int firstNumber = 0;

        int secondNumber = 0;
        if (firstNumber % secondNumber == 0) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
