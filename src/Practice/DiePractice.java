package Practice;

import java.security.SecureRandom;

public class DiePractice {
    public static void main(String[] args) {
        SecureRandom randomNumbers = new SecureRandom();

        System.out.println("Welcome to your dice game where you throw dice at random to win");

        int[] frequency = new int[7];

        for (int roll = 0; roll < 60_000_000; roll++) {
            ++frequency[1+ randomNumbers.nextInt(6)];

        }

        System.out.printf("%s%10s%n ", "Face", "Frequency");


        for (int face = 0; face < frequency.length ; face++) {

            System.out.printf("%4d%10d%n", face, frequency[face]);

        }

    }
}
