package Practice;

import java.util.Scanner;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int student = scanner.nextInt();

        System.out.println("Enter number of subjects: ");
        int subject = scanner.nextInt();

        int[][] studentGrade = new int[student][subject];
        int[][] total = new int[3][1];
        double[][] average = new double[3][1];
        int position[][] = new int[3][1];


        for (int row = 0; row < studentGrade.length; row++) {
            int sum = 0;
            for (int column = 0; column < studentGrade.length; column++) {
                System.out.printf("Enter student %d for subject %d: ", row + 1, column + 1);
                studentGrade[row][column] = scanner.nextInt();

                sum = sum + studentGrade[row][column];
                total[row][0] = sum;
                average[row][0] = (double) (sum / studentGrade.length);
            }

        }
        for (int row = 0; row < studentGrade.length; row++) {
            for (int column = 0; column < studentGrade.length; column++) {
                System.out.print(studentGrade[row][column] + "       ");
            }
            for (int column = 0; column < 1; column++) {
                System.out.print(total[row][column] + "       ");
            }
            for (int column = 0; column < 1; column++) {
                System.out.print(average[row][column] + "       ");
            }
            System.out.println();

        }
    }

}
