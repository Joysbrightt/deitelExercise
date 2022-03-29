package ChpaterOne;

import java.security.SecureRandom;

public class Examples {
    public static void main(String[] args) {
        SecureRandom secureRandom = new SecureRandom();

        for (int counter =1; counter<= 20; counter++){
            int face = 1 + secureRandom.nextInt(6);
            System.out.printf("%d  ", face);
            if (counter % 5 ==0){
                System.out.println();
            }

        }


    }
//    private static int result = 0;
//
//    public void addition(int num1, int num2) {
//        result =num1 + num2;
//    }
//
//    public static int getAddition() {
//        return result;
//    }
//
//
//
//
//
//    public  static double maximum(double x, double y, double z) {
//        double maximumValue = x;
//
//        if (y > maximumValue ) {
//            maximumValue = y;
//        }
//        if(z > maximumValue){
//            maximumValue = z;
//        }
//
//
//        return maximumValue;
//
//    }
}
