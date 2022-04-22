package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];
        int sum = 0;
        int product = 1;
        System.out.println("Enter 10 numbers: ");

      //  System.out.println(Arrays.toString(numbers)); to do a quick check of array elements

        // using an array a fori loop is needed to load the array
        for (int index = 0; index <= 9; index++) {
                numbers[index] = 2 + ( 2 * index);

//            System.out.println("Enter number: ");
//            numbers[index] = input.nextInt();
//            sum = sum + numbers[index];
//            product = product * numbers[index];
        }

//        System.out.println("The sum is "+sum);
//        System.out.println("The product is "+product);
        // and another fori loop is needed to print the result of an array
        for (int index = 0; index <= 9; index++) {
            System.out.println(numbers[index]);
        }

    }
}
