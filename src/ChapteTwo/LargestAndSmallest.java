package ChapteTwo;

import java.util.Scanner;

public class LargestAndSmallest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numb, number, numbb, numberr, nuber;
        System.out.println("Enter an integer: ");
        numb = scanner.nextInt();

        System.out.println("Enter an integer: ");
        number = scanner.nextInt();

        System.out.println("Enter an integer: ");
        numbb = scanner.nextInt();

        System.out.println("Enter an integer: ");
        numberr = scanner.nextInt();

        System.out.println("Enter an integer: ");
        nuber = scanner.nextInt();

        int largest = nuber;
        if(numb > largest){
            System.out.println("The largest number is: " +numb);
        }

        if(number > largest){
            System.out.println("The largest number is: " +number);
        }

        if(numbb > largest){
            System.out.println("The largest number is: " +numbb);
        }

        if(numberr > largest){
            System.out.println("The largest number is: " +numberr);
        }

        System.out.println("The largest numbe is: " + largest);



        int smallest = numb;
        if(number < numb){
            System.out.println("The smallest number is" +number);
        }

        if(numbb < numb){
            System.out.println("The smallest number is" +numbb);
        }

        if(numberr < numb){
            System.out.println("The smallest number is" +numberr);
        }
        if(nuber < numb){
            System.out.println("The smallest number is" +nuber);
        }

        System.out.println("The smallest number is " +smallest);









    }
}
