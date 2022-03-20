package Chapter2;
import java.util.Scanner;
public class DivisibleBy {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Enter an integer : ");
        int number = input.nextInt();

//        number %= 0;
        if(number / 3 == 0) {
            System.out.println("The number is divisible by 3");
        }else
        {
            System.out.println("The number is not divisible by 3");
        }










    }
}
