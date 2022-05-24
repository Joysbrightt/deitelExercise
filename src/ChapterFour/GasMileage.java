package ChapterFour;

import java.util.Scanner;

public class GasMileage {
    //collect input of the miles driven used for each trip
    // collect input of the gallon used for each trip
    // calculate and display the miles per gallon used(both in integers)
    // print the miles per gallon obtained for all trips
    // tje average should produce
    //use class scanner and sentinel-controlled iteration to obtain the data

    public static void className(int calculate){
int milesDriven =0;
int gallonUsed =0;
        calculate = milesDriven + gallonUsed * 2;
        if (gallonUsed == calculate){

            System.out.println(" the driver has entered incorrect values");
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int gallonUsed = 0;
        int milesDriven = 0;
        int calculateMilesPerGallon = 0;
        double totalMilesPerGallon = 0;
        double totalAvgMilesPerGallon = 0;
        int counter =0;




        while( gallonUsed != -1 || milesDriven != -1) {


            System.out.println("Enter the miles covered for each trip: ");
            milesDriven = scanner.nextInt();

            System.out.println("Enter the gallon used for each trip: ");
            gallonUsed = scanner.nextInt();

            calculateMilesPerGallon = milesDriven / gallonUsed;
            System.out.println("The miles per gallon used is: " +calculateMilesPerGallon);

            totalMilesPerGallon += (calculateMilesPerGallon);
            counter++;
            totalAvgMilesPerGallon = totalMilesPerGallon / counter;






        }
        System.out.println("The miles per gallon is: " + calculateMilesPerGallon);
        System.out.println("The total miles per gallon is: " +totalMilesPerGallon);
        System.out.println("The total average of miles per gallon is: " +totalAvgMilesPerGallon);






// i

////GasMileage gasMileage = new GasMileage();
//
//        milesDriven();
//        GasMileage.gallonUsed();
//        calculateMilesPerGallon();
//

    }


}