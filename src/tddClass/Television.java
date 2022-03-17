package tddClass;

public class Television {
    private boolean isOn;
    private int volume;
    private int channel;
    private boolean mute;


    public void turnOn() {
        isOn = !isOn;
    }

    public boolean isOn() {
        return isOn;
    }


    public void increaseVolume() {
        if (isOn) {
            if (volume <= 20)
                volume = volume + 1;
            else if (volume > 25)
                volume = 20;
        }
    }

    public int getVolume() {
        return volume;
    }

    public void decreaseVolume() {
        if (isOn) {
            if (volume == 1)
                volume = 0;
            volume--;
            if (volume >= 20)
                volume = volume - 1;
            else if (volume < 0)
                volume = 0;
        }
    }

    public void increaseChannel() {
        this.channel = channel;
        if (isOn) {
            channel = 1;
            channel++;
        }

    }

    public int getChannel() {
        return channel;
    }

    public void decreaseChannel() {
        this.channel = channel;
        if (isOn) {
            channel = 20;
            channel--;

        }
    }

    public boolean mute() {
        if (!isOn) {
            return false;
        }
        if(isOn)
        return true;
        return true;
    }


    public void unMute() {
        isOn = !isOn;

    }
}