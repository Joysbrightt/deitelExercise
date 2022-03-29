package ChpaterOne;

import java.security.SecureRandom;
import java.util.Scanner;

public class RandomNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SecureRandom  secureRandom = new SecureRandom();
        int count = 0;

        System.out.println("Welcome to your random operation Test");
        for( int i = 1; i <= 5; i++){
            System.out.println("hey");
            int firstNumber =1+ secureRandom.nextInt(10);
            int secondNumber =1+ secureRandom.nextInt(10);
            int operation = 1+ secureRandom.nextInt(4);
            int userInput ;
//            System.out.println(operation);
            switch (operation){

                case 1:
                    System.out.printf(" What is:  %d * %d", firstNumber,secondNumber);
                        userInput = scanner.nextInt();

                    if( userInput == firstNumber * secondNumber){
                        count++;
                    }
                    break;
                case 2:
                    System.out.println("What is: "+ firstNumber +" / "  +secondNumber);
                        userInput = scanner.nextInt();

                    if( userInput == firstNumber / secondNumber){
                        count++;
                    }

                    break;
                case 3:
                    System.out.printf(" What is:  %d + %d%n", firstNumber,secondNumber);
                        userInput = scanner.nextInt();
                    if( userInput == firstNumber + secondNumber){
                        count++;
                    }

                    break;
                case 4:
                    System.out.printf(" What is:  %d - %d", firstNumber,secondNumber);
                    userInput = scanner.nextInt();
                    if( userInput == firstNumber - secondNumber){
                        count++;
                    }
                    break;

            }


        }
            System.out.println("count: "+count);
        System.out.println("Incorrect:" +( 5-count));


    }

}