package Practice;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class Practicee {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("what is your name: ");
        String username = scanner.nextLine();
        System.out.println("Hello" +username);


        System.out.println("How are old are you");
        int age = scanner.nextInt();
       int year =  LocalDate.now().minusYears(age).getYear();
        System.out.println("You were born in " +year);
//
//
//        Date date = new Date();
//
//        String name = new String("Tomisin");
//
//        System.out.println(name.toUpperCase());
//
//        LocalDate now = LocalDate.now();
//        System.out.println(now.getMonth());
//        String s = new String();
//
//
//        String surname = new String("Oladoyin");
//        System.out.println(surname.equalsIgnoreCase(surname));

    }
}
