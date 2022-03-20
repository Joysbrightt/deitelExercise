package chapter01;
import java.util.Scanner;
public class workout {
    public static void main(String[] args) {
            Scanner workouut = new Scanner(System.in);
                int numb;
            System.out.println("Enter a number with five integers: ");
            numb = workouut.nextInt();
         int numb1 = numb / 10000;
        int numb2 = (numb % 10000) / 1000;
        int numb3 = (numb % 1000)/ 100;
        int numb4 = (numb % 100) / 10;
        int numb5 = (numb % 10);




        System.out.printf("%d  %d  %d  %d  %d%n", numb1, numb2, numb3, numb4, numb5 );


    }

}
