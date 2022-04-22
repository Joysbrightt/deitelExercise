package ChapteTwo;

import java.util.Scanner;

public class CircumferenceOfACircle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        double  diameter, circumference, area;

        System.out.println("Enter the radius of a circle (r): ");
        int radius = (int) scanner.nextDouble();

        diameter = 2 * radius;
        System.out.println("The diameter of this circle is:" +diameter);

        circumference = (2 * Math.PI * radius);
        System.out.println("The circumference of this circle is:" +circumference);


        area = Math.PI *(radius * radius);
        System.out.println("The area of this circle is:" +area);

    }
}
