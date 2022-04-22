package Practice;

import java.util.Scanner;

public class CollegeGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // promt student to enter grade
        // count the number of test results of each type
        // display a summary of the test results, indicating the numberof sttudents who passed
        // and the number who falled
        // if more than eight students passed the exam, print "bonus to instructor"


        int resultCounter = 1;
        int countera1 = 0;
        int countera2 = 0;

        while (resultCounter <= 10) {
            System.out.println("Enter grade ( a1 = pass, or a2 = fail): ");
            int result = scanner.nextInt();

            if (result == 1) {
                countera1 +=1;
            } else {
                countera2 +=1;
            }
            resultCounter = resultCounter + 1;
        }
        System.out.printf(" student passed: %d%n student failed: %d%n ", countera1, countera2);

        if (countera1 >= 8) {
            System.out.println("Bonus to the instructor");
        } else {
            System.out.println("You failed");
        }

    }
}
