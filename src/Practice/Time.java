package Practice;

public class Time {


    private int hour;

    private int minute;

    private int second;

    public Time(int hour, int minute, int second){
        validate(hour,minute,second);
        this.hour = hour;
        this.minute = minute;
        this.second = second;

    }

    public Time(){
        this(0, 0,0);

    }
    public Time (int second){
        this(0, 0, second);
        validSecondsWith(second);
        this.second = second;

    }

    public Time(int minute, int second){
        this(0, minute, 0);
        validSecondsWith(second);
        validMinutesWith(minute);
        this.minute = minute;
        this.second = second;

    }


    public void setTime(int hour, int minute, int second){

        this.hour = hour;
        this.minute = minute;
        this.second = second;

    }
    private void validate(int hour, int minute, int second){

        validateHourWith(hour);
        validMinutesWith(minute);
        validSecondsWith(second);
      }


    private static void validateHourWith(int hour){

        boolean hourIsValid = hour < 0 || hour >=24;

        if (hourIsValid) throw new IllegalArgumentException("Invalid hour");

    }

    private static void validMinutesWith(int minute){
        boolean minuteIsValid = minute < 0 ||minute >= 60;
        if (minuteIsValid) throw new IllegalArgumentException("Invalid minute");

    }

    private static void validSecondsWith(int second){
        boolean secondIsValid = second < 0 ||second >= 60;

        if (secondIsValid) throw new IllegalArgumentException("Invalid seconds");

    }


    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        validSecondsWith(second);
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        validMinutesWith(minute);
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        validSecondsWith(second);
        this.second = second;
}


}

