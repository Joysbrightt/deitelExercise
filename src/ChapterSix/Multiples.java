package ChapterSix;

import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        //collect 2 integers
        //check integers
        //print result
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter two integers: ");
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int isMultiple = firstNumber / secondNumber;
        isMultiple(12,4);
        System.out.println("isMultiple" +isMultiple(12,4));
    }

    public static boolean isMultiple( int firstNumber, int secondNumber) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextInt();
        if(firstNumber % secondNumber == 0){
             System.out.println("Return True");
         } else{
             System.out.println("Return False");
         }

        return true;


    }

}