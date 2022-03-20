package Chapter2;

import java.util.Scanner;
public class ConversionOfPounds{

    public static void main(String [] args){

    Scanner input = new Scanner(System.in);

    System.out.print("Enter number in pounds : ");
    double p = input.nextDouble();


    double k = 0.454 * p ;
    System.out.printf("%n%n%.2f pounds is %.4f kilograms%n" , p, k );







}

}
