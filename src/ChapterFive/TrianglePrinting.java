package ChapterFive;

public class TrianglePrinting {
    public static void main(String[] args) {

        // print an asterisks
        // use for loop
        //print triangle one before the other
        //print triangle side by side

        int column = 9;

        for (int row = 1; row <= column; row++) {
            for (int j = 1; j < row; j++) {

                System.out.print("* ");
            }

            System.out.println();
        }
        for (int row = 9; row <= column; row++) {
            for (int j = 9; j < row; j++) {

                System.out.print("* ");
            }
            System.out.println();

        }
        for (int row = 1; row <= column; row++) {
            for (int j = 1; j < row; j++) {

                System.out.print("* ");
            }
            System.out.println();

        }
        for (int row = 1; row <= column; row++) {
            for (int j = 1; j < row; j++) {

                System.out.print("* ");
            }
            System.out.println();

        }
        System.out.println();
        for (int row = 1; row <= column; row++) {
            for (int j = 1; j < row; j++) {

                System.out.print("* ");
            }
            System.out.println();

        }
    }
}


