package ChapteTwo;

import java.util.Scanner;

public class ArithmeticSmallestAndLargest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int firstNumber, secondNumber, thirdNumber;

        System.out.println("Enter an integer: ");
            firstNumber = scanner.nextInt();

        System.out.println("Enter an integer: ");
        secondNumber = scanner.nextInt();

        System.out.println("Enter an integer: ");
        thirdNumber = scanner.nextInt();

        int largest = thirdNumber;
        if(firstNumber > largest){
            System.out.println("firstNumber is the largest" +firstNumber);
        }

        if(secondNumber > largest){
            System.out.println("secondNumber is the largest" +secondNumber);
        }
        System.out.println("thirdNumber is the largest" +largest);


        int product = firstNumber * secondNumber * thirdNumber;
        System.out.println("The product of the three number is:" + product);

        int average = product % 3;
        System.out.println("The average of the three number is:" +average);

        int sum = firstNumber + secondNumber + thirdNumber;
        System.out.println("The sum of the three number is: " +sum);

















    }
}
