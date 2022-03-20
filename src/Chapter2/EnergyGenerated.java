package Chapter2;

import java.util.Scanner;
public class EnergyGenerated {

    public static void main(String [] args){

    Scanner input = new Scanner(System.in);

    System.out.print("Enter the amount of water in kilograms: ");
    double water = input.nextDouble();

    System.out.print("Enter the firsTemperature : ");
    double firstTemperature = input.nextDouble();

    System.out.print("Enter the lastTemperature : ");
    double lastTemperature = input.nextDouble();
    
    double Q =( water * (firstTemperature -lastTemperature) * 4184);
   System.out.printf(" %n%n The energy needed is : %.1f%n%n" , Q);



}


}
