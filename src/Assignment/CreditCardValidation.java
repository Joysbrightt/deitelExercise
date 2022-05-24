package Assignment;

import java.util.Scanner;

public class CreditCardValidation {
    private static Scanner scanner = new Scanner(System.in);
    private static int creditCard;
    int digitSum = 0;
    public static void validatingUserInput() {
        System.out.println("Enter card number: ");
        creditCard = scanner.nextInt();

        int digitSum = 0;

        for (int doubleEveryDigit = 0; doubleEveryDigit <= creditCard; doubleEveryDigit += 2) {
            creditCard += creditCard;

            int oddNumber;

            digitSum = doubleEveryDigit + oddNumber;
        }
        if (digitSum % 10 ==0){
            System.out.println("cardNumber is valid");
        } else {
            System.out.println("cardNumber is invalid");
        }

    }

    public int getCreditCard(int creditCard){

        return creditCard;
    }


//    public void sumOfOddPlace(int creditCard){
//        digitSum =
//    }

    public boolean isValid(int digitSum) {

        if (digitSum % 10 != 0) {
            return false;
        }
            return true;
    }

    public void sumOfDoubleEvenPlace(int creditCard){

        for (int oddNumber = 2; oddNumber <= creditCard; oddNumber++) {
            creditCard += creditCard;

        }

    }

    public static void main(String[] args) {

       validatingUserInput();


    }

}
