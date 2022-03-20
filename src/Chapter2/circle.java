package Chapter2;

import java.util.Scanner;

public class circle{


public static void main(String [] args){

    Scanner input = new Scanner(System.in);
    double r;
System.out.print("Enter the number of radius: ");
r = input.nextDouble();

double diameter =r * 2;
double area = ((r * r) * Math.PI);
double circumference = ( 2 * Math.PI * r);
    System.out.println("diameter " +diameter);
    System.out.println("area " +area);
    System.out.println("circumference " +circumference);


System.out.printf("%.1f%n %.1f%n %.1f%n %.1f%n ", r, area, diameter,circumference );

}


}
