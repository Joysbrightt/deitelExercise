package ChapterTen.AbstractClass;

import Practice.AbstractClass.ArrayList;
import Practice.AbstractClass.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayListTest {
List list = new ArrayList();
    @BeforeEach
    void setUp() {
        list = new ArrayList();
    }

    @Test public void addTest(){
        List list = new ArrayList();
        list.add("Boxers for boyFriend");
        assertEquals(1, list.size());
    }

    @Test public void addAndGetTest(){

        list.add("String on a guitar");
        list.add("Protective gearing");
        assertEquals("Protective gearing",list.get(1));
    }

    @Test
    public void removeTest(){

        list.add(" String on a guitar");
    list.remove(0);
    assertEquals(0, list.size());

    }


}