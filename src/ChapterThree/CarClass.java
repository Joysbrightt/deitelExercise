package ChapterThree;

import java.security.SecureRandom;

public class CarClass {

    private String model;
    private String year;
    private double price;

    public void Carclass(String model, String year, double price) {
        this.model = model;
        this.year = year;

        if (price > 0){
            this.price = price;
        }
    }

    public String getModel() {
        return model;
    }

    public String getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }
    public String setModel(String model) {
        this.model = model;
        return model;
    }

    public String setYear(String year) {
        this.year = year;
        return year;
    }

    public void setPrice(double price) {
        if (price != +price){
            price = 0;
        } else
        this.price = price;
    }

    public static double carPrice(double interest, double price){
        return price * 0.5;
    }

    public static double carrPrice(double interest, double price){

        return price * 0.7;
    }

    public static void main(String[] args) {
        CarClass carClass = new CarClass();
        carClass.setPrice(123.32);
        carClass.setModel("benz");
       carClass.setYear("2021");
       carrPrice(1873667.12,0.5);
       carPrice(183749374.32, 0.7);

        System.out.println( carClass.setModel("benz"));
        System.out.println( carClass.setYear("2021"));
        System.out.println( carrPrice(873667.12,0.5));
        System.out.println( carrPrice(183749374.32, 0.7));


        SecureRandom secureRandom = new SecureRandom();
        int num = secureRandom.nextInt(9);
        System.out.println(num +1);





    }




}
