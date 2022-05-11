package NewPractice;

import java.util.Arrays;

public class StudentGrading {
    public static void main(String[] args) {

        int [][] studentGrade = {{5,10,8,1}, {4,8,10,3}, {1,2,10,4}, {0,4,8,10}, {3,5,5,0}, {4,8,7,9}, {2,3,4,10}};
//      int total = 0;
//      int[][] eachSubjectTotal = new int[studentGrade.length][0];
//        for (int row = 0; row < studentGrade.length; row++) {
//            int sum = 0;
//            int column;
//            for (column = 0; column < studentGrade[row].length; column++) {
//                sum = sum + studentGrade[row][column];
//
//            }
//            total +=sum;
////            System.out.println((total));
//            System.out.println(sum);
//        }
//        System.out.println(total);

        int sum = 0;
        for (int row = 0; row < studentGrade.length; row++) {

            for (int column = 0; column < studentGrade[1].length; column++) {
                sum = row + studentGrade[row][column];
            }
            System.out.println(sum);
          }



    }

}
