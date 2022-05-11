package NewPractice;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.reflect.Array.*;
import static java.util.Arrays.copyOf;

public class ArrayChallenge {
    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        int[] myIntegers = getInteger(5);
       int[] sorted = sortedArray(myIntegers);
       printArray(sorted);



    }
//loading an array through a user input
    private static int[] getInteger(int number) {
        int [] array = new int[number];
        System.out.println("Enter + number + integer value: \r");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();

        }
        return array;
    }
// printing an array
    public static void printArray(int[]array){

        for (int i = 0; i < array.length; i++) {
            System.out.println("Element + i + contents: " +array[i]);
        }

    }
// The 2 ways to sort an array either by manually sorting it using a loop
//    or by using java array builtin method

    public static int[] sortedArray(int[] array){
//        int [] sortedArray = new int[array.length];
//        for (int i = 0; i < array.length; i++) {
//            sortedArray[i] = array[i];
//
//        }
//int [] sortedArray = new int[array.length];
//        for (int i = 0; i < array.length; i++) {
//            sortedArray[i] = array[i];
//            using a java builtin method to sort array
//            int [] sortedArray = copyOf(array, array.length);
int[] sortedArray = Arrays.copyOf(array, array.length);

        boolean flag = true;
        int temp;

        while(flag){

            flag = false;
            for (int i = 0; i < sortedArray.length -1; i++) {
                temp = sortedArray[i];
                sortedArray[i] = sortedArray[+1];
                sortedArray[i] = temp;
                flag = true;
            }
        }

return sortedArray;
    }




}
