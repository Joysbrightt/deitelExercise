package Assignment;

import java.util.Scanner;

public class DigitalNumber {

private static final int[][] display = new int[5][4];
    public static String collectUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a binary number(0 or 1): ");
//        return scanner.nextLine();
        String input = "10110101";
        return input;
    }

    public static boolean isOn(int displaySwitch) {
        if (displaySwitch ==1) {
            return true;
        } else
        return false;
    }


    public char displaySegmentControl() {
        for (int[]row: display) {
                 for (int column : row) {
                     if (column ==1) System.out.print("# ");
                     else System.out.println("  ");
                 }
            System.out.println();
            }

        return '#';
    }


    public boolean isValidInputLength(String binaryDigit) {
        if(binaryDigit.length() != 8){
            return false;
        }

        return true;
    }

    public boolean isValidBinaryInput(String inputNumber) {
        for (int index = 0; index < inputNumber.length(); index++) {
            if (inputNumber.charAt(index) != '0' || inputNumber.charAt(index) != 1){
                return false;
            }
        }
        return true;
    }








}
