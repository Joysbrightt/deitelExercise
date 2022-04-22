package ChapteTwo;

import java.util.Scanner;

public class comparingNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number;
        System.out.println("Enter an integer: ");
        number = scanner.nextInt();

        int numbSquare =  number * number;

        if(number < 100){
            System.out.printf(" number is less than 100: %d < %d ", number, 100);
        }

        if(number > 100){
            System.out.printf(" number is greater than 100: %d > %d ", number, 100);
        }

        if(number == 100){
            System.out.printf(" number is equal to 100: %d == %d ", number, 100);
        }

        if(number != 100){
            System.out.printf(" number is not equal to 100: %d != %d ", number, 100);
        }

        if(numbSquare < 100){
            System.out.printf(" The square of the number is less than 100: %d < %d ", numbSquare, 100);
        }

        if(numbSquare > 100){
            System.out.printf(" The square of the number is greater than 100: %d < %d ", numbSquare, 100);
        }

        if(numbSquare == 100){
            System.out.printf(" The square of the number is equal to 100: %d < %d ", numbSquare, 100);
        }

        if(numbSquare != 100){
            System.out.printf(" The square of the number is not equal to 100: %d < %d ", numbSquare, 100);
        }


    }
}
