package Chapter2;
import java.util.Scanner;
public class ComparingNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numb;
        System.out.println("Enter an integer : ");
            numb = input.nextInt();
            int numbSquare = numb * numb;

            if( numb < 100){
                System.out.printf("%d%n   is less than",  +100);
            }
        if( numb > 100){
            System.out.printf("%d%n   is greater than",  +100);
        }

        if( numb == 100){
            System.out.printf("%d%n   is equal to",  +100);
        }
        if( numb != 100){
            System.out.printf("%d%n   is not equal to",  +100);
        }

        if( numbSquare!= 100){
            System.out.println("numbSquare is not equal to +100");
        }

        if( numbSquare == 100){
            System.out.printf("%d%n   is equal to",  +100);
        }

        if( numbSquare > 100){
            System.out.printf("%d%n   is greater than",  +100);
        }

        if( numbSquare < 100){
            System.out.printf("%d%n   is less than",  +100);
        }


    }

}
