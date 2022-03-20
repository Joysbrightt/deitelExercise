package Chapter2;

import java.util.Scanner;

public class Difference{

    public static void main(String [] args){


    Scanner input = new Scanner(System.in);

    System.out.print("Enter the firstNumber: ");
       int numb1 = input.nextInt();


    System.out.print("Enter the secondNumber: ");
        int numb2= input.nextInt();

        int numbValue =numb1 *  numb1;

        int numbValue2 =numb2 * numb2;

    int sum = ( numbValue + numbValue2);
    int difference = ( numbValue - numbValue2);
    System.out.println("difference " +difference);
        System.out.println("sum " +sum);







}




}
