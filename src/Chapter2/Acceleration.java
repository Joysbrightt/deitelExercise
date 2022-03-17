import java.util.Scanner;
public class Acceleration{

    public static void main(String [] args){

    Scanner input = new Scanner(System.in);

    System.out.print("Enter the first velocity (v0) m/s : ");
    double velocity = input.nextDouble();

    System.out.print("Enter the second velocity (v1) in m/s : ");
    double velocity2 = input.nextDouble();

    System.out.print("Enter the time (t) seconds : ");
    double time = input.nextDouble();
    
    double acceleration = (velocity -velocity2)/time ;
   System.out.printf(" %n%n The energy needed is : %f%n%n" , acceleration);



}


}
