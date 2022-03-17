import java.util.Scanner;
public class Length{

    public static void main(String [] args){

    Scanner input = new Scanner(System.in);

    System.out.print("Enter the speed (v) in m/s : ");
    double v = input.nextDouble();

    System.out.print("Enter the acceleration (a) in m/s^2 : ");
    double a = input.nextDouble();

    double l = ((v * v) / (2 * a));
    System.out.printf(" %n%n The minimum runaway length for this airplane is : %.3f" , l);


}


}
