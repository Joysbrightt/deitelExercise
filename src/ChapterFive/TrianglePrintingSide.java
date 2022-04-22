package ChapterFive;

public class TrianglePrintingSide {
    public static void main(String[] args) {

        int column = 9;

        for (int row = 1; row <= column; row++) {
            for (int j = 1; j < row; j++) {

                System.out.print(" * ");
            }

            for ( row = 1; row <= column; row++) {
                for (int j = 1; j < row; j++) {

                    System.out.print(" * ");
                }

                System.out.println(" ");
            }

            for ( row = 1; row <= column; row++) {
                for (int j = 1; j < row; j++) {

                    System.out.print(" * ");
                }

                System.out.println(" ");
            }
            System.out.println(" ");
        }
    }
}