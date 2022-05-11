package NewPractice;

public class StarPrinting {
    public static void main(String[] args) {


        int n = 5;

//        for (int row = 1; row <= n; row++) {
//
//            for (int column = row; column <= n ; column++) {
//
//                System.out.print("  ");
//            }
//
//                for (int column = 1; column <= row ; column++) {
//
//                    System.out.print("* ");
//                }
//            System.out.println();
//            }

        for (int roww = 1; roww <= n; roww++) {

            for (int column = 1; column <= roww ; column++) {

                System.out.print(" o ");
            }

            for (int column = roww; column <= n ; column++) {

                System.out.print(" * ");
            }
            System.out.println();
        }


        }





    }