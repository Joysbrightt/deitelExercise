package Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class SevenSegmentDisplay {

     public static void main(String[] args) {
          String digit = collectInput();
          int indexOfLastDigit = digit.length()-1;

          if(!isValidInputLength(digit)){
               System.exit(0);
          }

          if(isOn(Integer.parseInt(String.valueOf(digit.charAt(indexOfLastDigit))))){
               firstSegment(Integer.parseInt(String.valueOf(digit.charAt(0))));
               secondSegment(Integer.parseInt(String.valueOf(digit.charAt(1))));
               thirdSegment(Integer.parseInt(String.valueOf(digit.charAt(2))));
               fourthSegment(Integer.parseInt(String.valueOf(digit.charAt(3))));
               fifthSegment(Integer.parseInt(String.valueOf(digit.charAt(4))));
               sixthSegment(Integer.parseInt(String.valueOf(digit.charAt(5))));
               lastSegment(Integer.parseInt(String.valueOf(digit.charAt(6))));
          }
          isValidbinaryString(digit);
          displaySegment();
          for (int[] row:display) {
               for (int column:row) {
                    System.out.print(column + " ");
               }
               System.out.println();
          }

     }

     private static final int[][] display = new int[5][4];

     public static String collectInput(){
          Scanner scanner = new Scanner(System.in);
          System.out.println("Enter a binary number (0 or 1): ");
          return scanner.nextLine();
     }

     public static boolean isOn( int displaySwitch ){
          if (displaySwitch == 1){
               return true;
          } else {
               return false;
          }

     }

     private static void displaySegment(){
          for (int[] row:display) {
               for (int column:row) {
                    if (column==1) System.out.print("# ");
                    else System.out.print("  ");
               }
               System.out.println();
          }
     }


     public static boolean isValidInputLength(String binaryDigit) {
          if (binaryDigit.length() != 8) {
               return false;
          }
          return true;
     }

     public static boolean isValidbinaryString(String binarynumber){
          for (int index = 0; index <binarynumber.length() ; index++) {
               if (binarynumber.charAt(index) != '0' || binarynumber.charAt(index) !=1 ){
                    return false;
               }
          }
          return true;
     }

     public static void firstSegment(int firstDigit){
          if (firstDigit==1) {
               display[0][0] = 1;
               display[0][1] = 1;
               display[0][2] = 1;
               display[0][3] = 1;
          }
     }

     public static void secondSegment(int secondDigit){
          if (secondDigit==1) {
               display[0][3] = 1;
               display[1][3] = 1;
          }
     }
     public static void thirdSegment(int third_digit){

          if(third_digit ==1){
               display[3][3] = 1;
               display[4][3] = 1;
          }
     }

     public static void fourthSegment(int fourthDigit){
          if (fourthDigit ==1){
               display[4][0] =1;
               display[4][1] =1;
               display[4][2] =1;
               display[4][3] =1;
          }
     }
     public static void fifthSegment(int fifthdigit){

          if (fifthdigit ==1){
               display[3][0] =1;
               display[4][0] =1;
          }
     }
     public static void sixthSegment( int sixthdigit){
          if (sixthdigit ==1){
               display[1][0] =1;
               display[2][0] =1;
          }
     }


          public static void lastSegment(int seventhdigit){
          if ( seventhdigit ==1){

               display[2][1] =1;
               display[2][2] =1;
               display[2][3] =1;
          }
     }

}
