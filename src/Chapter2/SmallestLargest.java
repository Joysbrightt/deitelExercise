package Chapter2;
import java.util.Scanner;
public class SmallestLargest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numb;
        int numb1;

        System.out.println("Enter the firstNumber : ");
        numb = input.nextInt();

        System.out.println("Enter the secondNumber");
        numb1 = input.nextInt();
        if( numb > numb1){
            System.out.println("firstNumber is the largest");
        }
        if( numb < numb1){
            System.out.println("firstNumber is the smallest");
        }
        if( numb1 > numb){
            System.out.println("secondNumber is the largest");
        }
        if( numb1 < numb ){
            System.out.println("secondNumber is the smallest");
        }


    }
}
