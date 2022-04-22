package ChapterFour;

import java.util.Scanner;

public class SalesCommissionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalSales = 0;

        System.out.println("Enter the number of item sold or -1 to quit: ");
        int itemCount = scanner.nextInt();

        while( itemCount != -1){
            System.out.println("Enter the amount of items sold: ");

            if (itemCount == -1) {
                itemCount = -1;
                break;
                }
// value number has been giving in the question, so implementing it is the executing process

            }

        for ( itemCount = 0; itemCount < 4; itemCount++) {
            double itemSales = 0;

        itemSales = itemSales * (itemCount * 230);

        totalSales = 200 + 9 *itemSales;


    }
        System.out.println("The total amount of the amount of the sales: " +totalSales);




    }
}
