package Practice;

import java.util.Scanner;

public class ArrayOfFood {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of day of the week: ");
        int dayOfTheWeek = scanner.nextInt();

        System.out.println("Enter food number for the day: ");
        int food = scanner.nextInt();


        String days [][] = new String[dayOfTheWeek][food];
        //String time [] [] = new String[][];
        scanner.nextLine();
        for (int row = 0; row < days.length; row++) {

            for (int column = 0; column < 3; column++) {
                System.out.printf("Enter food %5d for day %5d: ", column +1, row +1);
                days[row][column] = scanner.nextLine();

            }

        }

        for (int row = 0; row < days.length ; row++) {

            for (int column = 0; column < 3 ; column++) {
                System.out.print(days[row][column]
                + "    ");

            }
            System.out.println();
        }









    }
}
