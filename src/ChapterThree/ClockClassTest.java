package ChapterThree;

import groovy.transform.ASTTest;

import java.time.Clock;

public class ClockClassTest {
    public static void main(String[] args) {


        ClockClass clock1 = new ClockClass(22,50,50);
        System.out.println("The time is "+clock1.displayTime());

        ClockClass clock2 = new ClockClass(03,45,59);
        System.out.println("The time is "+clock1.displayTime());
    }



}
