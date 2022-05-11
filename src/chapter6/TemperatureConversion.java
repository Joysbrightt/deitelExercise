package chapter6;

import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
            runCoversionApp();

    }














    private static final Scanner scanner = new Scanner(System.in);
    private static int userInput;

    public static void runCoversionApp() {

        String instruction = """
                Press 1 to convert celsius to Kelvin
                Press 2 to convert Kelvin to celsius
                Press 3 to exit app
                """;

        System.out.println(instruction);
        userInput = scanner.nextInt();

        switch (userInput) {
            case 1:
                System.out.println("Enter a temperature in celsius");
                double celsius = scanner.nextDouble();
                Kata.convertToKelvin(celsius);
                System.out.println("The conversion to Celsius is:" +
                        " " + Kata.convertToKelvin(celsius));
                break;

            case 2:
                System.out.println("Enter a temperature in Kelvin(k): ");
                double kelvin = scanner.nextDouble();
                Kata.convertToCelsius(kelvin);
                System.out.println("The conversion to Kelvin is: " +
                        "" + Kata.convertToCelsius(kelvin));
                break;
            case 3:
                System.out.println("Application closed");
                break;
            default:
                System.out.println("Invalid entry");
                runCoversionApp();
        }
    }
}





