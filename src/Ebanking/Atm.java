package Ebanking;

import java.util.Scanner;

public class Atm {
    private static final Scanner scanner = new Scanner(System.in);

    private static final Banking gtBank = new Banking("gtBank",20);

    public static void main(String[] args) {

        runApp();
    }

    private static void runApp(){
        String prompt = """
                Welcome to gtBank,
                Kind press your operation number
                1. -> To Create Account.
                2. -> To Deposit.
                3. -> To Withdraw.
                4. -> To Transfer.
                5. -> To Check balance.
                6. -> To exit.
                """;
        System.out.println(prompt);
        String userResponse = scanner.nextLine();
        switch (userResponse){
            case "1": createAccount();
            break;
            case "2": deposit();
            break;
            case "3": withdraw();
            break;
            case "4": transfer();
            break;
            case "5": checkBalance();
            break;
            case "6": exit();

            default: runApp();

        }


    }
private static void exit(){
    System.out.println("Thank you for banking with us");
    System.exit(0);
}

private static void checkBalance(){
    System.out.println("Enter account number");
    String accountNumber = scanner.nextLine();

    System.out.println("Enter pin");
    String pin = scanner.next();
    Accounting account = gtBank.findAccount(Integer.parseInt(accountNumber));
    System.out.println("Your balance is: " +account.getBalance(pin));
    scanner.next();
    runApp();

    }

    private static void transfer(){
        System.out.println("Enter account number: ");
        String senderAccountNumber = scanner.nextLine();

        System.out.println("Enter receivers account");
        String receiverAccountNumber = scanner.nextLine();

        System.out.println("Enter pin");
        String pin = scanner.nextLine();

        System.out.println("Enter amount");
        int amount = scanner.nextInt();

        gtBank.transfer(amount,senderAccountNumber,receiverAccountNumber, pin);
        gtBank.findAccount(Integer.parseInt(senderAccountNumber));
//        System.out.println("Your new balance is: " + fromAccount.getBalance(pin));
        scanner.next();
        runApp();
    }


    private static void withdraw(){
        System.out.println("Enter acount number: ");
        String accountNumber = scanner.nextLine();

        System.out.println("Enter pin: ");
        String pin = scanner.nextLine();

        System.out.println("Enter amount");
        int amount = scanner.nextInt();

        gtBank.withdraw(amount, accountNumber, pin);
        System.out.println("successful!!!");
        Accounting account = gtBank.findAccount(Integer.parseInt(accountNumber));
        System.out.println();
        System.out.println("New balance is: " +account.getBalance(pin));
        System.out.println();

        scanner.next();
        runApp();

    }

    private static void deposit(){
        System.out.println("Enter account");
        String accountNumber = scanner.nextLine();

        Accounting account = gtBank.findAccount(Integer.parseInt(accountNumber));
        System.out.println("The account name is: " +account.getFullName());

        System.out.println("Enter amount: ");
        int amount = scanner.nextInt();

        gtBank.deposit(amount, accountNumber);

        System.out.println();
        System.out.println(account);
        System.out.println();
        scanner.next();
        runApp();

    }

private static void createAccount(){
    System.out.println("Enter your first name: ");
    String firstName = scanner.nextLine();

    System.out.println("Enter your surname: ");
    String lastName = scanner.nextLine();

    System.out.println("Enter pin: ");
    String pin = scanner.nextLine();

    System.out.println();
    System.out.println();
    
    Accounting savedAccount = gtBank.createAccountFor(firstName, lastName, pin);
    System.out.println(savedAccount);
    System.out.println();
    System.out.println();
    runApp();

}


}
