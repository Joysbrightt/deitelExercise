package ChapteTwo;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int userWeight;
        System.out.println("Enter your weight in pounds(pounds): ");
        userWeight = scanner.nextInt();

        int userHeight;
        System.out.println("Enter your height in inches(inches): ");
        userHeight = scanner.nextInt();
        double bmiCalculation = (double) ( userWeight  * 703 / (userHeight *userHeight));

        System.out.println("The user BMI calculation is: " +bmiCalculation);

    }
}
