package ChapteTwo;

import java.util.Scanner;

public class Palindromes {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int fivedigits;

        System.out.println("Enter a five digit numbers: ");
        fivedigits = scanner.nextInt();

        System.out.println(fivedigits / 10000 % 1000 );
        System.out.println(fivedigits % 10000 / 1000 );
        System.out.println((fivedigits / 100) % 10);
        System.out.println((fivedigits % 100) / 10);
        System.out.println(fivedigits % 10);


    }
}
