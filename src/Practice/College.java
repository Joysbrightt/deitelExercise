package Practice;

import java.util.Random;
import java.util.Scanner;

public class College {
    //    private String stud_id;
//    private  int student_id;
////    private charkeyboardLight;
//
//    public static void main(String[] args) {
//
//
//
//        College a1 = new College();
//        //this to show if the datatype aren't the same
//        a1.stud_id = String.valueOf(1);
//        College a2= new College();
//        a2.student_id = 1;
//    }
    public static void main(String[] args) {

        int[][] matrix = new int[10][10];

        Scanner scanner = new Scanner(System.in);

//        System.out.println("Enter " + matrix.length + " rows and "
//                + matrix[0].length + " columns");
//
//        for (int row = 0; row < matrix.length; row++) {
//
//            for (int column = 0; column < matrix[row].length; column++) {
//
//                matrix[row][column] = scanner.nextInt();
//
//            }
//
//        }
//
//
//        // intializing array with random values using loop to inializes th
//        //array with random values between 0 and99
//
//        for (int row = 0; row < matrix.length; row++) {
//
//            for (int column = 0; column < matrix[row].length; column++) {
//                matrix[row][column]= (int)(Math.random() * 100);
//
//            }
//
//        }
//
//
//        //printing arrays.
//
//        // to print a two dimensional array, you have to print each element in the array using loop
//
//        for (int row = 0; row < matrix.length; row++) {
//
//            for (int column = 0; column < matrix[row].length; column++) {
//
//                System.out.println(matrix[row][column] + " ");
//
//            }
//            System.out.println();
//        }
//
//        //summing all elements. use a variable method to store sum
//        //intialize to 0. add each element in the array to total using loop
//int total = 0;
//        for (int row = 0; row < matrix.length; row++) {
//
//            for (int column = 0; column < matrix[row].length; column++) {
//
//            total += matrix[row][column];
//
//            }
//
//        }

// summing elements by column. For each column,
        // add each element in the column to total using a loop

//
//        for (int colum = 0; colum < matrix[0].length; colum++) {
//
//            total = 0;
//
//            for (int row = 0; row < matrix.length; row++) {
//
//                total+= matrix[row][colum];
//                System.out.println("Sum for column " +colum + " is " +total);
//            }
//        }

//
//    int maxRow = 0;
//        int indexOfMaxRow = 0;
//
//        for (int column = 0; column < matrix[0].length; column++) {
//
//       maxRow += matrix[0][column];
//        }
//
//
//            for (int row = 1; row < matrix.length; row++) {
//
//                int totalOfThisRow =0;
//                for (int column = 0; column < matrix[row].length ; column++) {
//                        totalOfThisRow += matrix[row][column];
//
//                    if (totalOfThisRow > maxRow){
//
//                        maxRow = totalOfThisRow;
//                        indexOfMaxRow = row;
//                }
//            }
//
//        System.out.println("Row " +indexOfMaxRow+ " has the maximum sum of " +maxRow);
//
//        }
//

//            //random shuffling. shuffling elemtent in a two-dimensional array
//
//        for (int i = 0; i < matrix.length; i++) {
//
//            for (int j = 0; j < matrix[i].length ; j++) {
//
//                int il = (int)(Math.random() * matrix.length);
//                int jl = (int) (Math.random() * matrix[i].length);
//
//                // Swap matrix[i][j] with matrix[il][jl]
//                int temp = matrix[i][j];
//                matrix[i][j] = matrix[il][jl];
//                matrix[il][jl] = temp;
//            }
//        }

        //shuffling of array element without using temp storage
        int[][] array = {{1,2,3,4,5}, {3,4}, {5,6}};

        for (int row = array.length -1; row>=0; row--) {

            for (int column = array[row].length -1; column >=0 ; column--) {
                System.out.print(array[row][column] + " ");
            }
            System.out.println();
        }


        int[][] arrray = {{1,2}, {3,4},{5,6}};
        int sum = 0;

        for (int row = 0; row < array.length ; row++) {
            sum+= arrray[row][0];
            System.out.println(sum);
        }





    }
}