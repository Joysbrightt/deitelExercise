package tddClass;

public class AirConditioner {
    private boolean isOn;
    private int temperature = 16;

    public boolean isOn() {
        return isOn;
    }

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
        temperature = 0;
    }

    public int getTemperature() {
        return temperature;
    }

    public int increaseTemperature() {
        if (isOn == true) {
            if (temperature < 30) {
                temperature++;
            } else if (temperature > 30) {
                return 30;
            }

        } else {
            temperature = 0;
        }
        return temperature;
    }

    public int decreaseTemperature() {
        if (isOn == true);
            else{
                 temperature = 0;
                if (temperature < 30) {
                    temperature--;
                } else if (temperature > 30) {
                    return 30;
                    }

                }
        return 0;
    }
        }


