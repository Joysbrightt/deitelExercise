package ChapterFive;

public class DiamondPrinting {

    public static void main(String[] args) {
        DiamondPrinting diamondPrinting = new DiamondPrinting();

        diamondPrinting.printingDiamond();

        
    }






    
    public  void printingDiamond(){
        
        int number = 5;

        for (int row = 1; row < number; row++) {

//            first column
            for (int column = row; column <= number ; column++) {

                System.out.print("  ");
            }

//            second column
            for (int column = 1; column <= row; column++) {

                System.out.print(" * ");
            }
//third column
            for (int column = 1; column <= row ; column++) {

                System.out.print(" * ");
            }

            System.out.println();
        }
// printing the opposite of triangle to form diamond shape
        number = 5;
        for (int row = 1; row <= number; row++) {

//            first column
            for (int column = 1; column <= row ; column++) {

                System.out.print("  ");
            }
//              second column
            for (int column = row; column <= number ; column++) {
                System.out.print(" * ");
            }

//            third column
            for (int column = row; column <= number ; column++) {

                System.out.print(" * ");
            }
            System.out.println();
        }
        
        
    }
    
    
}
