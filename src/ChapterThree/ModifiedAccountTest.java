package ChapterThree;

import java.util.Scanner;

public class ModifiedAccountTest {
    public static void main(String[] args) {
        ModifiedAccount account1 = new ModifiedAccount("Tomisin", 50.00);
        ModifiedAccount account2 = new ModifiedAccount("Oladoyin", 50.00);

        System.out.printf(" %s balance:  $%.2f%n",
                account1.getName(), account1.getBalance());
        System.out.printf("%s balance:  $%.2f%n",
                account2.getName(), account2.getBalance());

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter deposit amount for Account1: ");
        double depositAmount = scanner.nextDouble();

        System.out.printf("%n adding %.2f to account balance%n%n",
                depositAmount);
        account1.deposit(depositAmount);
        System.out.printf(" %s balance:  $%.2f%n",
                account1.getName(), account1.getBalance());

        System.out.printf("%s balance:  $%.2f%n",
                account2.getName(), account2.getBalance());
        System.out.println("Enter deposit amount for Account2: ");
         depositAmount = scanner.nextDouble();
        System.out.printf("%n adding %.2f to account balance%n%n",
                depositAmount);
        account1.deposit(depositAmount);
        System.out.printf(" %s balance:  $%.2f%n",
                account2.getName(), account2.getBalance());


        System.out.println("Enter withdrawal amount for Account1: ");
        double withdrawalAmount = scanner.nextDouble();

        System.out.printf(" %s balance:  $%.2f%n",
                account1.getName(), account2.getWithdrawalAmount());
        System.out.printf(" %s balance:  $%.2f%n",
                account1.getName(), account1.getBalance());
        System.out.println("Enter withdrawal amount for Account2: ");
        withdrawalAmount = scanner.nextDouble();
        System.out.printf(" %s balance:  $%.2f%n",
                account1.getName(), account2.getBalance());


        System.out.printf(" %s balance:  $%.2f%n",
                account1.getName(), account1.getBalance());

        System.out.printf(" %s balance:  $%.2f%n",
                account1.getName(), account2.getBalance());

    }
}
