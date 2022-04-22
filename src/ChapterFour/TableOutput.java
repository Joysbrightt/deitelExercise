package ChapterFour;

public class TableOutput {
    public static void main(String[] args) {

        // create a table of a number with 3 powers
        //use loop to print the numbers

        int number;
        for (int i = 0; i < 2; i++) {
            number =1;
            number = (int) (1 * Math.pow(2,Math.pow(3,4)));
            System.out.printf("%8s%8s%8s%8s\t", "N", "N2", "N3", "N4" );

            System.out.printf("%d%8d%8d%8d\t ", number, number, number, number);
number++;
        }
        System.out.println();





    }
}
