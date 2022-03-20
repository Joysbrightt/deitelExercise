package tddClass;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numb;
        System.out.println("Enter a digit");
        numb = input.nextInt();
        int rem;
        int track = 1;
        int temp = numb;
        for (int i = 0; i<5;i++){
            rem = numb%10;
            track = track*10/rem;
            numb=temp/10;
            System.out.println(numb);
            System.out.println(temp);
            System.out.println(track);
        }
        if (temp == numb){
            System.out.println("True");
        }else {
            System.out.println("False");
        }
    }

}
