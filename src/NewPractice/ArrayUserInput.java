package NewPractice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayUserInput {
    private static Scanner scanner = new Scanner(System.in);

    private static int[] getIntegers(int number) {
        System.out.println("Enter + number+ integer values \r");
int[]values = new int[number];
        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();

        }
return values;
    }

    private static double getAverage(int[] array){
 int sum= 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
       return  (double) sum /(double)array.length;

    }


    public static void main(String[] args) {

        int[] myInteger = getIntegers(5);
        for (int i = 0; i < myInteger.length; i++) {
            System.out.println("Enter + number+ integer values:" + Arrays.toString(myInteger));

        }

        System.out.println("The average is: " +getAverage(myInteger));
    }

}
