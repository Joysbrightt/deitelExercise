package ChaperFive;

import java.util.Scanner;

public class PrintingNumberAsteric {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numb;
        int numbb;
        int numbe;
        int numbee;
        int number;

        System.out.println("Enter a number that is less than thirty: ");
        numb = input.nextInt();
        System.out.println("Enter a number that is less than thirty: ");
        numbb = input.nextInt();

        System.out.println("Enter a number that is less than thirty: ");
        numbe = input.nextInt();

        System.out.println("Enter a number that is less than thirty: ");
        numbee = input.nextInt();

        System.out.println("Enter a number that is less than thirty: ");
        number= input.nextInt();

        for(int i =0; i <numb; i++){
            System.out.print("* ");
        }
        System.out.println();
        for(int i =0; i <numbb; i++){
            System.out.print("* ");
        }
        System.out.println();
        for(int i =0; i <numbe; i++){
            System.out.print("* ");
        }
        System.out.println();
        for(int i =0; i <numbee; i++){
            System.out.print("* ");
        }
        System.out.println();

        for(int i =0; i <number; i++){
            System.out.print("* ");
        }
    }
}
