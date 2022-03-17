package tddClass;

public class Bike {
    private boolean isOn;
    private int speed;
    private String gear;

    public void bikeOn() {
        isOn = !isOn;
    }

    public boolean isOn() {
        return isOn;
    }


    public void accelerate() {
        if (isOn) {
            if (speed <= 20)
                speed = speed + 1;
            else if (speed <= 30)
                speed = speed + 2;
            else if (speed <= 40)
                speed = speed +3;
            else if (speed > 40)
                speed = speed +4;
            else if(speed < 0)
                speed = 0;
        }
    }

    public int getSpeed() {
        return speed;
    }

    public void decelerate() {
        if (isOn) {
            if (speed <= 20)
                speed = speed - 1;
            else if (speed <= 30)
                speed = speed - 2;
            else if (speed <= 40)
                speed = speed -3;
            else if (speed > 40)
                speed = speed -4;
            else if(speed < 0)
                speed = 0;
        }
    }


    public void gearIndicator(int enter) {
        if (isOn) {
            if (enter < 0)
                gear = "invalid gear selection";
            else if (enter <= 20)
                gear = "gear one";
            else if (enter <= 30)
                gear = "gear two";
            else if (enter <= 40)
                gear = "gear three";
            if (enter > 40)
                gear = "gear four";

        }

    }

    public String getGearIndicator() {
        return gear;
    }
}