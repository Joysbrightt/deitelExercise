package chapter01;

public class PetrolPurchase {
    private String stationLocation;
    private double price;
    private double percentage;
    private String petrol;
    private int quantity;

    public PetrolPurchase(String location, int quantity, double price, double percentage){
        stationLocation = location;
        this.price = price;
        this.percentage = percentage;
        this.quantity = quantity;
    }

    public void station(String location ){
        this.stationLocation = stationLocation;
    }

    public String getStationLocation(){
        this.stationLocation = stationLocation;
        return stationLocation;
    }

    public void petrol (String petrol){
        this.petrol = petrol;
    }

    public String getPetrol(){
        this.petrol = petrol;
        return petrol;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;

    }

    public int getSetQuantity(){
        this.quantity = quantity;
        return quantity;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public double getPrice(){
        this.price = price;
        return price;
    }

    public double getPercentage() {
        this.percentage = percentage;
        return percentage;
    }
    public double getPurchaseAmount(){
    double netAmount = quantity * price - percentage;
        return netAmount;
    }

}
