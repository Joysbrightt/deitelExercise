package Practice.AbstractClass;

public class Express {
    public static void main(String[] args) {
        Car car = new Car(){

            @Override
            public void turnLeft() {

            }
        };

        Car car1 = new Car() {
            @Override
            public void turnLeft() {

            }
        };
    }
}
