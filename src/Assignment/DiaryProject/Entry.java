package Assignment.DiaryProject;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Entry {

    private String date;
    private  String body;
    private String title;
    public Entry(String title, String body){
        this.title = title;
        this.body = body;
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("E,dd-MM-yyyy,hh-mma");
        date = dateTimeFormatter.format(LocalDateTime.now());
    };


    public String getDate() {
        return date;
    }


    public String getBody(String s) {

        return body;
    }

    public String getTitle() {
        return title;
    }
}
