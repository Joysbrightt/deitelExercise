package tddClass;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numb;
        System.out.println("Enter a digit");
        numb = input.nextInt();

        int numb1;
        System.out.println("Enter a digit");
        numb1 = input.nextInt();

        int numb2;
        System.out.println("Enter a digit");
        numb2 = input.nextInt();

        if (numb == numb2) {
            System.out.println("This is a palindrome");
        }
        if (numb != numb2) {
            System.out.println("This is not palindrome");
        }


    }

}
