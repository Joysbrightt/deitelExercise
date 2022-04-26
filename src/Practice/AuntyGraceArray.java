package Practice;

public class AuntyGraceArray {
    public static void main(String[] args) {


        int[][] array = {{1,2,3},
                        {2,3},
                        };

        int sum = 0;
        for (int row = 0; row < array.length ; row++) {

            for (int column = 0; column < array[row].length; column++) {

                sum = sum + array[row][column];

//                System.out.println("The sum of the array" +row+ "and " +column+ "is: ");

            }

        }
        System.out.println("The sum of the array is: " +sum);
        System.out.println();


    }
    // Arrays
    // functions
    //tdd
    //methods

}
