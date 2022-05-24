package Assignment;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter. api.Assertions.*;


public class BikeTest {

        @Test
        public void bikeOnTest() {
            Bike userBike = new Bike();
            //assert
            assertFalse(userBike.isOn());
            userBike.bikeOn();
            assertTrue(userBike.isOn());

        }

        @Test
        public void bikeOffTest() {
            Bike userBike = new Bike();
            //assert
            userBike.bikeOn();
            assertTrue(userBike.isOn());
            //assert
            userBike.bikeOn();
            userBike.bikeOn();
            userBike.bikeOn();
            assertFalse(userBike.isOn());
        }

        @Test
        public void increaseSpeedGearOne() {
            Bike userBike = new Bike();
            userBike.bikeOn();
            assertTrue(userBike.isOn());
            userBike.accelerate();
            userBike.accelerate();
            userBike.accelerate();
            userBike.accelerate();
            userBike.accelerate();
            //assert
            assertEquals(5, userBike.getSpeed());

        }

        @Test
        public void increaseSpeedGearTwo() {
            Bike userBike = new Bike();
            userBike.bikeOn();
            assertTrue(userBike.isOn());
            // whileloop
            int run = 1;
            while (run <= 21) {
                userBike.accelerate();
                run = run + 1;
            }
            userBike.accelerate();
            userBike.accelerate();
            userBike.accelerate();
            //assert
            assertEquals(27, userBike.getSpeed());
        }

        @Test
        public void increaseSpeedGearThree() {
            Bike userBike = new Bike();
            userBike.bikeOn();
            assertTrue(userBike.isOn());
            // whileloop
            int run = 1;
            while (run <= 21) {
                userBike.accelerate();
                run = run + 1;
            }
            userBike.accelerate();
            userBike.accelerate();
            userBike.accelerate();
            userBike.accelerate();
            userBike.accelerate();

            userBike.accelerate();
            userBike.accelerate();
            //assert
            assertEquals(37, userBike.getSpeed());
        }

        @Test
        public void increaseSpeedGearFour() {
            Bike userBike = new Bike();
            userBike.bikeOn();
            assertTrue(userBike.isOn());
            // whileloop
            int run = 1;
            while (run <= 21) {
                userBike.accelerate();
                run = run + 1;
            }
            userBike.accelerate();
            userBike.accelerate();
            userBike.accelerate();
            userBike.accelerate();
            userBike.accelerate();

            userBike.accelerate();
            userBike.accelerate();
            userBike.accelerate();
            userBike.accelerate();

            userBike.accelerate();
            userBike.accelerate();
            //assert
            assertEquals(51, userBike.getSpeed());
        }

        @Test
        public void decreaseSpeedGearFour() {
            Bike userBike = new Bike();
            userBike.bikeOn();
            assertTrue(userBike.isOn());
            // whileloop
            int run = 1;
            while (run <= 21) {
                userBike.accelerate();
                run = run + 1;
            }
            userBike.accelerate();
            userBike.accelerate();
            userBike.accelerate();
            userBike.accelerate();
            userBike.accelerate();

            userBike.accelerate();
            userBike.accelerate();
            userBike.accelerate();
            userBike.accelerate();

            userBike.accelerate();
            userBike.accelerate();
            //assert
            assertEquals(51, userBike.getSpeed());

            userBike.decelerate();
            //assert
            assertEquals(47, userBike.getSpeed());
        }

        @Test
        public void decreaseSpeedGearThree() {
            Bike userBike = new Bike();
            userBike.bikeOn();
            assertTrue(userBike.isOn());
            // whileloop
            int run = 1;
            while (run <= 21) {
                userBike.accelerate();
                run = run + 1;
            }
            userBike.accelerate();
            userBike.accelerate();
            userBike.accelerate();
            userBike.accelerate();
            userBike.accelerate();

            userBike.accelerate();
            userBike.accelerate();
            userBike.accelerate();
            userBike.accelerate();

            userBike.accelerate();
            userBike.accelerate();
            //assert
            assertEquals(51, userBike.getSpeed());

            userBike.decelerate();
            userBike.decelerate();
            userBike.decelerate();


            userBike.decelerate();
            //assert
            assertEquals(36, userBike.getSpeed());
        }

        @Test
        public void decreaseSpeedGearTwo() {
            Bike userBike = new Bike();
            userBike.bikeOn();
            assertTrue(userBike.isOn());
            // whileloop
            int run = 1;
            while (run <= 21) {
                userBike.accelerate();
                run = run + 1;
            }
            userBike.accelerate();
            userBike.accelerate();
            userBike.accelerate();
            userBike.accelerate();
            userBike.accelerate();

            userBike.accelerate();
            userBike.accelerate();
            userBike.accelerate();
            userBike.accelerate();

            userBike.accelerate();
            userBike.accelerate();
            //assert
            assertEquals(51, userBike.getSpeed());

            userBike.decelerate();
            userBike.decelerate();
            userBike.decelerate();


            userBike.decelerate();
            userBike.decelerate();
            userBike.decelerate();

            userBike.decelerate();
            //assert
            assertEquals(28, userBike.getSpeed());
        }

        @Test
        public void decreaseSpeedGearOne() {
            Bike userBike = new Bike();
            userBike.bikeOn();
            assertTrue(userBike.isOn());
            // whileloop
            int run = 1;
            while (run <= 21) {
                userBike.accelerate();
                run = run + 1;
            }
            userBike.accelerate();
            userBike.accelerate();
            userBike.accelerate();
            userBike.accelerate();
            userBike.accelerate();

            userBike.accelerate();
            userBike.accelerate();
            userBike.accelerate();
            userBike.accelerate();

            userBike.accelerate();
            userBike.accelerate();
            //assert
            assertEquals(51, userBike.getSpeed());

            userBike.decelerate();
            userBike.decelerate();
            userBike.decelerate();


            userBike.decelerate();
            userBike.decelerate();
            userBike.decelerate();

            userBike.decelerate();
            userBike.decelerate();
            userBike.decelerate();
            userBike.decelerate();
            userBike.decelerate();
            userBike.decelerate();
            //assert
            assertEquals(19, userBike.getSpeed());
        }

        @Test
        public void GearOneTest() {
            Bike userBike = new Bike();
            userBike.bikeOn();
            assertTrue(userBike.isOn());
            userBike.gearIndicator(30);
            //assert
            assertEquals("gear three", userBike.getGearIndicator());


        }

}
