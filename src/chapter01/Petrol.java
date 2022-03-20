package chapter01;

public class Petrol {
    public static void main(String[] args) {
        PetrolPurchase petrol = new PetrolPurchase ("station-location", 5, 150.1, 5.8);
       /* PetrolPurchase diesel = new PetrolPurchase("location", 7, 165, 5);*/
        System.out.print(petrol.getPurchaseAmount());






    }
}
