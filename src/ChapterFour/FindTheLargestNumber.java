package ChapterFour;

import java.util.Scanner;

public class FindTheLargestNumber {
    public static void main(String[] args) {

        // input a series of 10 integers
        //using a counter to count to 10
        // it should have most recent input by the user
        //determine the largest integer
        // print the largest integer

        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        while (counter <= 10){
            System.out.println("Enter the number of unit sold: ");
            int numberSold = scanner.nextInt();

            counter++;

            int findMaximum = Math.max(counter, numberSold);
        }
        System.out.println("The maximum number of unit sold by a salesperson is: ");


        for (int cunter = 0; cunter <=10; cunter++) {
            System.out.println("Enter the number of unit sold: ");
            int soldNumber = scanner.nextInt();
            int findTheMaximum = Math.max(cunter, soldNumber);

        }
        System.out.println("The maximum number of sales by a salesperson is: ");
    }

}
