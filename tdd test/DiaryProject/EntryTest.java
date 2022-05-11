package DiaryProject;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class EntryTest {
    private Entry entry;
    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("E,dd-MM-yyyy,hh-mma");
    private String date = dateTimeFormatter.format(LocalDateTime.now());
    private String body;

    @BeforeEach
    public void setup(){
        entry = new Entry("do little","I want to eat");

    }
    @Test
public void entryCanBeCreated(){
        assertNotNull(entry);

    }
    @Test

    public void dateCanBeAddedTest(){

        assertEquals(date, entry.getDate());


    }

    @Test
    public void bodyCanBeAdded(){
        assertEquals("I want to eat", entry.getBody(" "));

    }

    @Test
    public void titleCanBeAdded(){

        assertEquals("do little", entry.getTitle());
    }

}
