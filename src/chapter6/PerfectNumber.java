package chapter6;

public class PerfectNumber {
    private boolean isPerfect;

    public boolean isPerfect(int number) {
int numberPerfet;
 numberPerfet = number + number;
        if (number + number == numberPerfet);{
            System.out.println(" The number is a perfect number: ");
        }
        return true;
    }

    public int isPerfect() {
        int number;
        for (number = 0; number <= 1000; number++) {
            int numberUsingLoop = isPerfect();

            System.out.println(numberUsingLoop);

        }

        return number;
    }

    public static void main(String[] args) {
        PerfectNumber perfectNumber = new PerfectNumber();

        perfectNumber.isPerfect();
    }
}
