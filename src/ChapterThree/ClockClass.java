package ChapterThree;

import java.time.Clock;
import java.time.format.DateTimeFormatter;

public class ClockClass {
    private int hour;
    private  int minute;
    private int seconds;

    public ClockClass(int hour, int minute, int seconds){

        this.hour = hour;
        this.minute = minute;
        this.seconds = seconds;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
        if (hour > 23 ){

            hour = 0;
        }

    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
        if (minute < 0 && minute > 59){

            minute = 0;
        }

    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;

        if (seconds < 0 && seconds > 59){
            seconds = 0;
        }

    }

    public String displayTime(){
        return getHour()+":"+getMinute()+":"+getSeconds();
//        System.out.println(getHour() +":"+ getMinute() +":"+ getSeconds());


//        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("E, MM-dd-yy hm:mm:s a");

    }


}
