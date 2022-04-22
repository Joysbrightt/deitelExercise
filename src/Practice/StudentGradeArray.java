package Practice;

import java.util.Scanner;

public class StudentGradeArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of student: ");
        int numberOfStudent = scanner.nextInt();

        System.out.println("Enter number of subject: ");
        int subject = scanner.nextInt();

        int[][] student = new int[3][1];
        int[][]studentGrade = new int[numberOfStudent][subject];
        int[][] total = new int[3][1];
        double[][]average = new double[3][1];
        int[][] position = new int[3][1];

        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 3; column++) {
                student[row][0] = row + 1;
                System.out.printf("Enter the Student %d and subject %d ",row+1, column+1);
                studentGrade[row][column] = scanner.nextInt();

            }
        }

        for (int row = 0; row < studentGrade.length; row++) {

            int sum = 0;
            for (int column = 0; column <3 ; column++) {
                sum = sum + studentGrade[row][column];
                total[2][0] = sum;
                average[2][0] = (double)sum / 3;
            }

        }System.out.println();
        System.out.println("STUDENT      Sub1    Sub2   Sub3   Total  Avg");

        for (int row = 0; row <3 ; row++) {
            for (int column = 0; column < 1; column++) {
                System.out.printf("%s%d  ","Student",student[row][column]);

            }

            for (int column = 0; column < 3; column++) {
                System.out.printf("%7d", studentGrade[row][column]);
            }

            for (int column = 0; column < 1; column++) {
                System.out.printf("%d   ", total[row][column]);

            }

            for (int column = 0; column < 1; column++) {
                System.out.printf("%.2f   ",average[row][column] );

            }
            System.out.println();

        }

    }
}
