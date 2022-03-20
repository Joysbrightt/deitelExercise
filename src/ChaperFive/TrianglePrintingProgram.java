package ChaperFive;

public class TrianglePrintingProgram {
    public static void main(String[] args) {
        int triangleLength = 10;
        //INCREASING DOWN THE LOOP
        for (int row = 1; row <= triangleLength; row++) {
            for (int column = 1; column <= row; column++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();


        //DECREASING DOWN THE LOOP
        for (int row = 1; row <= triangleLength; row++) {
            for (int column = row; column <= triangleLength; column++) {
                System.out.print("* ");
            }
            System.out.println();
        }
            System.out.println();
        for (int row = 1; row <= triangleLength; row++) {
            for (int column = 1; column <= row; column++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        for (int row = 1; row <= triangleLength; row++) {
            for (int column = row; column <= triangleLength; column++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        }

}