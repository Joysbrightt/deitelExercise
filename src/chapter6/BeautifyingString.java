package chapter6;

import java.util.Locale;
import java.util.Scanner;

public class BeautifyingString {

    private static String letter;
    private String firstLetter;

    public static void terminateString() {

        int count = 0;

        for (int i = 0; i < letter.length(); i++) {
            if (letter.charAt(i) == ('.')) {
                System.out.println("fullstop occurs");
                count++;

            }
        }

    }

    public static void firstupperletter() {
        for (int i = 0; i < letter.length(); i++) {
            if (letter.charAt(i) == letter.charAt(0)) {
                String value = String.valueOf(letter.charAt(0)).toUpperCase(Locale.ROOT);{
                    System.out.println(value);
                    continue;
                }
            }

        }

    }

    public static void userApp(){
        Scanner scanner = new Scanner(System.in);
        letter = "";
        System.out.println("Enter a statement: ");
        letter = scanner.nextLine();
        terminateString();
        firstupperletter();


    }

    public static void main(String[] args) {
        userApp();






    }
}
