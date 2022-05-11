package Practice;

public class AuntyGraceArrayPractice {
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6,7,8};
        int sum = 0;
        for (int row = 0; row < array.length; row++) {

             sum =  sum + array[row];


        }
        System.out.println( "The sum of the array is: "+sum);

    }

}
