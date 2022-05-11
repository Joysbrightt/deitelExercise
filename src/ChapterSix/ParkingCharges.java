package ChapterSix;

import java.util.Scanner;

public class ParkingCharges {

//    write an application that calculates and display the parking charges for each customer
//    should enter the hours parked for each customer
//    display the charge for the current customer
//    display the running total of yesterday's receipts.
//    create a method calculateCharges to determine the charge for each customer



    double threeHoursParking = 2.00;

    double maximumParkingHours = 10;

    double total= 0;

    public void parkingCharge(){
        Scanner scanner = new Scanner(System.in);

            System.out.println(" Enter the number of hours of parking: ");
            int user = scanner.nextInt();

            while(scanner.hasNext()) {

                 threeHoursParking = 0;

                if (threeHoursParking == 3) {
                    threeHoursParking = 2.00;
                }

                if (user < threeHoursParking){
                    user = (int) 2.0;
                }
                if (user > threeHoursParking){
                    user += 4.0;
                }

                 maximumParkingHours = 0;
                if (maximumParkingHours == 24) {

                    maximumParkingHours = 10.0;
                }

                double calculate = user * threeHoursParking / 3;

                if (user == maximumParkingHours){
                    System.out.println("The price for the parking hours is: " +maximumParkingHours);
                }

                System.out.println("The price for the hours of parking is: " + calculate);

            user++;
            }

             total = total + user;
        System.out.println(+total);
    }


    public void displayYesterdays_receipts(double yesterdays_receipt){
   total = 0;
 total = total + total;

        System.out.println("The total receipt for the yesterday's sales is: " +yesterdays_receipt +total);
    }


    public  double calculateCharges(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of hours spent parking: ");
        double userHour = scanner.nextDouble();
        double totalCharge = 0;
        if (userHour <= 3){
            totalCharge = 2;
        }
        if (userHour > 3){
            totalCharge = userHour * 0.50 - 2.00 ;
        }

        System.out.println("The charge for the hours of parking is: " +totalCharge);
        return totalCharge;
    }

    public static void main(String[] args) {
        ParkingCharges parkingCharges = new ParkingCharges();
//        ParkingCharges.parkingCharge();
//
        parkingCharges.calculateCharges();



    }


}
