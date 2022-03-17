package chapter01;

import java.util.Scanner;

public class SimilarStructureOfNumbers {
    public static <counter> void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int numb;
        System.out.print("Enter a five digit number: ");
         numb = input.nextInt();
    numb = 12121;
        System.out.println(numb /10);
        System.out.println(numb /100);
        System.out.println(numb /1000);
        System.out.println(numb /10000);
        System.out.println(numb /100000);

        System.out.println(numb %10);
        System.out.println(numb %100);
        System.out.println(numb %1000);
        System.out.println(numb %10000);
        System.out.println(numb %100000);
        int  hits = numb / 100000;
        int meme = numb /10;
        if(meme == hits){
            System.out.println("This is a palindrome");
        }
    if (12121 %10 == 12121 %100000){
        System.out.println("This is a palindrome");
    }

    public class age {
        public int StudentAge;
        int age = 0;
        int ageCounter;


       while (age <=20){
            ageCounter = ageCounter + 1;
            age = age + 1;
        }
    }









    }
}
