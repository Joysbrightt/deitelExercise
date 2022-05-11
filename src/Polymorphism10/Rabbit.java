package Polymorphism10;

public class Rabbit extends Animal {

    @Override
    public void move() {
        System.out.println(" Move like a rabit");
    }

    public void eat(){

        System.out.println("Fresh carrot");
    }
}
