package ChapterThree;

import java.util.Scanner;

public class HeartRates {
//    create a class heartrate
//    class attribute should include firstname
//    class attribute should include last name
//    class attribute should include date of birth
//    a constructor
//    a calculate a person's and return age(in years)
//    calculate the maximum heart rate
//    calculate the person's~ target heart rate
    Scanner scanner = new Scanner(System.in);

    public String firstName;
    public String lastName;
    public int dateOfBirth;

    public HeartRates(String firstName, String lastName, int dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        System.out.println("Enter your date of birth");
        int dateOfbirth = scanner.nextInt();

    }

    public int calculatePersonAge(int personAge){
        int currentDate = 0;
        int birthDate= 0;
        int ageInYears = currentDate - birthDate;

        return ageInYears;
    }


public int calculateMaxHeartRate(int heartRate){
heartRate = 220 - calculatePersonAge(19);

    return heartRate;
}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HeartRates heartRate = new HeartRates("segun", "segun", 1998);

        String firstName;
        System.out.println("Enter your first name: ");
        firstName = scanner.nextLine();

        String lastName;
        System.out.println("Enter your last name: ");
        lastName = scanner.nextLine();

        int dateOfBirth;
        System.out.println("Enter your date of birth");
        dateOfBirth = scanner.nextInt();


//        HeartRates.calculateMaxHeartRate();



    }


}
