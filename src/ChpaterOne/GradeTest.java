package ChpaterOne;

import java.util.Scanner;

public class GradeTest {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);

        int total = 0, gradeCounter = 0;

        System.out.println("Enter grade or -1 to quit: ");
        int grade = scaner.nextInt();

        while(grade != -1){

            total = total + grade;
            gradeCounter = gradeCounter +1;

            System.out.println("Enter grade or -1 to quit: ");
                grade = scaner.nextInt();
        }

        if(gradeCounter != 0){

            double average = total / gradeCounter;

            System.out.printf("%n Total of the %d grade enter is %d%n ", gradeCounter, total);
            System.out.printf("Average of the grade entered is %d%n: ", average);

        }else{
            System.out.println("No grade was entered");
        }


    }
}
