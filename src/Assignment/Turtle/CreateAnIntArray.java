package Assignment.Turtle;

import java.util.Arrays;

public class CreateAnIntArray {
    private static int[][] createArray;

    public static int[][] getCreateArray() {
        int[][] array= new int[10][10];

        for (int row = 0; row <array.length; row++) {

            for (int column = 0; column < array[row].length; column++) {
                System.out.println(array[row][column]);
            }
        }

        return createArray;
    }


    public static void main(String[] args) {
        getCreateArray();
    }

}
