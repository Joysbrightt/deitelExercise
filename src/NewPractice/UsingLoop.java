package NewPractice;

public class UsingLoop {
    public static void main(String[] args) {

//        for (int i = 8; i >= 2; i--) {
//            System.out.println("10,000 at % interest = " + String.format("%2f", calculateInterest(10000.0, i)));
//
//        }

//        calculating a prime number
       int couter = 0;

        for (int i = 10; i < 40; i++) {
            if (isPrme(i)){
                couter++;
                System.out.println("The number " + i + " is a prime number");

                if (couter ==3) System.out.println("Exiting for loop");{

                }
                break;
            }

        }
    }

    public static double calculateInterest(double amount, double interestRate) {

        return (amount * (interestRate * 100));
    }

    public static boolean isPrme(int n) {

        if (n == 1) {
            return false;
        }
        for (int number = 0; number <= n / 2; number++) {
            if (n % number == 0) {
                return false;
            }
        }
        return true;
    }

}
