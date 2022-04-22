package ChapterFour;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double earninggTax = 0;
        for (int i = 0; i <= 3; i++) {
            System.out.println("Enter your earning: ");
            int earning = scanner.nextInt();

            earninggTax = (double) (15 * earning) / 100;
            double remainingEarning = 0;
            if (earning < 30000) {
                remainingEarning = earninggTax - 30000;

            } else {
                double excessTax = (20 * remainingEarning) / 100;
                earninggTax += excessTax;
            }

            System.out.println("tax is earning tax" + earninggTax);

        }


    }
}
