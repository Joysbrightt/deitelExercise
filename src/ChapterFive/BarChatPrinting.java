package ChapterFive;

//import java.util.Random;
import java.util.Scanner;

public class BarChatPrinting {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int readNumbers;
        System.out.println("Enter the a number from one(1) to thirty(30): ");
        readNumbers = scanner.nextInt();

        for (int start = 1;  start <= readNumbers;  start++) {

            System.out.print("* ");

        }


    }
}
