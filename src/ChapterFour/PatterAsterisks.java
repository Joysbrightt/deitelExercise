package ChapterFour;

public class PatterAsterisks {

    public static void main(String[] args) {
int columnn =5;
        for (int row = 0; row <= columnn; row++) {

            System.out.print("* ");
            for (int column = 1; column < 9 ; column++) {

                System.out.print("* ");

                System.out.print(" ");
            }
            System.out.println();
        }

    }
}
