package ChapterFour;

import java.util.Scanner;

public class RightAngeTriangle {

    public static void main(String[] args) {
        RightAngeTriangle.printTriangle();

    }
    public static void printTriangle(){

        Scanner scanner = new Scanner(System.in);
        int triangleLength = 0;

        System.out.println("Enter the triangle length between 1 and 10: ");
        triangleLength = scanner.nextInt();

        for (int row = 0; row < triangleLength ; row++) {

            for (int column = 0; column < row ; column++) {

                System.out.print("* ");

            }
            System.out.println();
        }
    }
}
