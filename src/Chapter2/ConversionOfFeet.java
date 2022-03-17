import java.util.Scanner;
public class ConversionOfFeet{

    public static void main(String [] args){

    Scanner input = new Scanner(System.in);

    System.out.print("Enter a value for feets : ");
    double ft = input.nextDouble();

    double mt = 0.454 * ft ;
    System.out.printf("%n%n%.2f feet is %.4f meters%n" , ft, mt );







}

}
