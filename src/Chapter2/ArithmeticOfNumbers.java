package Chapter2;
import java.util.Scanner;
public class ArithmeticOfNumbers {
    public static void main(String[] args) {
           Scanner input = new Scanner(System.in);
                double numb;
                double numb1;
                double numb2;

                System.out.println("Enter the firstNumber : ");
                numb = input.nextInt();

                System.out.println("Enter the secondNumber : ");
                numb1 = input.nextInt();

                System.out.println("Enter the thirdNumber : ");
                numb2 = input.nextInt();

                double sum = numb + numb1 + numb2;
                    System.out.printf("%d%0.f%n", +sum);

                double average = numb + numb1 + numb2 / 3;
                    System.out.printf("%d%0.f%n", +average);

                    double product = numb + numb1 + numb2 * 3;
                    System.out.printf("%d%0.f%n ", +product);

                if( numb > numb1){
                    System.out.println("firstNumber is the largest");
                }
                if( numb < numb1){
                    System.out.println("firstNumber is the smallest");
                }
                if( numb > numb2){
                    System.out.println("firstNumber is the largest");
                }

                if( numb1 > numb){
                    System.out.println("secondNumber is the largest");
                }
                if( numb1 < numb ){
                    System.out.println("secondNumber is the smallest");
                }
                if( numb1 > numb2){
                    System.out.println("secondNumber is the largest");
                }
        if( numb1 < numb2){
            System.out.println("secondNumber is the largest");
        }

        if( numb2 > numb){
            System.out.println("thirdNumber is the largest");
        }
        if( numb2 > numb1){
            System.out.println("firstNumber is the largest");
        }
        if( numb2 < numb){
            System.out.println("firstNumber is the smallest");
        }
        if( numb2 < numb1){
            System.out.println("firstNumber is the smallest");
        }


    }
        }
