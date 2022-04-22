package Practice;

public class BarChat {
    public static void main(String[] args) {
//        int[] array = {0,0,0,0,0,0,1,2,4,2,1};
//        System.out.println(" Grade distribution");
//
//        for (int counter = 0; counter < array.length; counter++) {
//
//            if(counter == 10){
//                System.out.printf("%8d: ", 100);
//            }else
//            {
//                System.out.printf(" %02d - %02d: ",
//                counter *10, counter* 10 + 9);
//            }
//            for (int stars = 0; stars <array[counter]; stars++) {

//                System.out.print("*");
//
//            }
//            System.out.println();
//        }

        int[] responses = {1, 2, 3, 5, 4, 2, 1, 3, 3, 1, 4, 3, 3, 3, 2, 3, 3, 2, 14};
        int[] frequecy = new int[6];

        for (int answer = 0; answer < responses.length; answer++) {
            try {
                ++frequecy[responses[answer]];

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
                System.out.printf("  responses[%d] = %d%n%n", answer, responses[answer]);
            }

        }

        System.out.printf("%s%10s%n", "Rating", "Frequency");

        for (int rating = 1; rating < frequecy.length; rating++) {
            System.out.printf("%6d%10d%n", rating, frequecy[rating]);
        }
    }

}

