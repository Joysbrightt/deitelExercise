package Assignment;

import java.util.Scanner;

public class NumberOfYears {

        public static void main(String [] args){

            Scanner input = new Scanner(System.in);

            System.out.print("Enter minutes: ");
            int minute = input.nextInt();


            int year = minute/525600;
            int days = minute/525600;
            int remainder = days / 1440;

            System.out.printf(" %n%n%d minutes is approximately %4d years and %3d remainder" , minute, year, remainder);



        }

    }
