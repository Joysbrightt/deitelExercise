package Polymorphism10;

public class Main {

    public static void main(String[] args) {

        Animal[] animals = new Animal[4];
        animals[0] = new Animal();
        animals[1] = new Rabbit();
        animals[2] = new Chicken();
        animals[3] = new Rat();

        for (var animal: animals) {
            animal.move();

        }

        Rabbit rabbit = new Rabbit();

        Animal rabbit2 = new Rabbit();

        Animal rabbit3 = new Rabbit();

        Rabbit rabbit4 = (Rabbit) new Rabbit();

    }

}
