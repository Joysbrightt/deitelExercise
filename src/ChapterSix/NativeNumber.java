package ChapterSix;

import java.util.Scanner;

public class NativeNumber {
    private  int  firstNumber;
    private int secondNumber;

    public boolean creating(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        firstNumber = scanner.nextInt();
        secondNumber = scanner.nextInt();

        if (secondNumber % firstNumber == 0){
            System.out.println("firstNumber is a multiple of secondNumber");
            return true;
        }
        else{
            System.out.println("false");
        }

        return false;
    }

    public static void creatingMethods() {

    }

    public int tomisinValue() {


        int tomisin = 0;
        return tomisin;
    }
    public static void main(String[] args) {
        NativeNumber multiple = new NativeNumber();
        multiple.creating();



//        NativeNumber number = new NativeNumber();
//
////        creatingMethods();
//        number.tomisinValue();

    }
}
//    private static int acTempertature;
//    private String name;
//    private int age;
//
//            public static int getAcTempertature

//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println(
//                "Enter three foating-point values separated by sepaces: "
//        );
//        double numb = input.nextDouble();
//        double numb1 = input.nextDouble();
//        double numb2 = input.nextDouble();
//
//        double result = maximum(numb, numb1, numb2);
//        System.out.println(
//                "Maximum is: "+ result
//
//        );
//    }
//    public static double maximum(double x, double y, double z){
//        double maximumValue = x;
//        if(y > maximumValue)
//            maximumValue = x;
//
//        if (y > maximumValue)
//            maximumValue = y;
//
//        if (z > maximumValue)
//            maximumValue =z;
//
//        return maximumValue;
//    }

//    public static AirConditioner ourAc;
//    private String name;
//    public static final int age AGE_AT_DEATH =50;
//    private String datOfBirth;
//    private day dayOfBirth (enum is used to change the dayOfBirth to constant)



