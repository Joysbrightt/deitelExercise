package ChapterThree;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class HealthProfile {

    private String firstName;
    private String lastName;
    private int dayOfBirth;
    private int monthOfBirth;
    private int yearOfBirth;
    private double height;
    private double weight;



    public HealthProfile(String firstName, String lastName, int yearOfBirth, double height, double weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
        this.height = height;
        this.weight = weight;
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

    public int getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(int dayOfBirth) {
        if(dayOfBirth > 0 && dayOfBirth < 32){
            this.dayOfBirth = dayOfBirth;
        }

    }

    public int getMonthOfBirth() {

        return monthOfBirth;
    }

    public void setMonthOfBirth(int monthOfBirth) {
        if (monthOfBirth > 0 && monthOfBirth < 12){

        this.monthOfBirth = monthOfBirth;
        }
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

//    public void setYearOfBirth(int yearOfBirth) {
//        if (yearOfBirth > 0 && yearOfBirth >= 1900) {
//
//            this.yearOfBirth = yearOfBirth;
//        }
//    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


    public int userAge() {
//        int currentYear = 2022;
        System.out.println(getDayOfBirth());
        int currentDate = 2022;
//       LocalDate currentDate = LocalDate.of(getDayOfBirth(), getMonthOfBirth(), getYearOfBirth());
        int userAge = currentDate - getYearOfBirth();
        return userAge;
    }

    public int calculateMaxHeartRate(int heartRate){
        heartRate = 220 - userAge();

        return heartRate;
    }


}
