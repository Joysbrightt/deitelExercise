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
// rabbit is an object of class Rabbit
        Rabbit rabbit = new Rabbit();

//        rabbit2 is an object of class Rabbit stored in superClass Animal
        Animal rabbit2 = new Rabbit();

//        rabbit3 is an object of class Rabbit stored in superClass Animal
        Animal rabbit3 = new Rabbit();

//        rabbit4 is an object of class Rabbit
        Rabbit rabbit4 = (Rabbit) new Rabbit();

    }

}
