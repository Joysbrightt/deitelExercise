import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class Arithmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numb;
        int numb1;

        System.out.print("Enter the first integer :");
        numb = input.nextInt();
        System.out.println("Enter the second integer : ");
        numb1 = input.nextInt();
        int numbSquare = numb * numb;
        int numbSquare1 = numb1 * numb1;

        System.out.println("numbSquare :" +numbSquare);
        System.out.println("numbSquare1 : " +numbSquare1);

        int difference = numbSquare - numbSquare1;
        System.out.println("difference : " +difference);

    }

}
