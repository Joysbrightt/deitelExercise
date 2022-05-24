//package DiaryProject;
//
//import Assignment.DiaryProject.Diary;
//import Assignment.DiaryProject.Entry;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertNotNull;
//
//public class DiaryTest {
//    private Diary diary;
//
//    @BeforeEach
//    public void setUp() {
//
//        diary = new Diary("tomi", "password");
//    }
//
//    @Test
//    public void diaryCanBeCreatedTest() {
//
//        assertNotNull(diary);
//    }
//
//    @Test
//    public void nameCanBeCreatedTest() {
//
//        assertEquals("tomi", diary.getName());
//    }
//
//    @Test
//    public void passwordCanBeCreatedTest() {
//        diary.setpassword("password");
//        assertEquals("password", diary.getpassword());
//    }
//
//    @Test
//    public void entryCanBeCreatedTest() {
//        Entry entry = diary.createEntry("Do little", "I want to eat");
//        entry.getTitle();
//        entry.getTitle();
//        assertEquals("Do little", entry.getTitle());
//        assertEquals("I want to eat", entry.getBody(" "));
//
//    }
//
//    @Test
//
//    public void entryCanBeAddedTest() {
//        Entry entry = diary.createEntry("Do", "I want to eat");
//        diary.addEntryIn(entry);
//        assertEquals("Do little", "Do little");
//
//    }
//
//    @Test
//    public void entryCanBeRemovedTest() {
//
//        Entry entry = diary.createEntry("Giving Thanks", "I am grateful");
//        diary.addEntryIn(entry);
//        diary.removeEntry(entry);
//
//        assertEquals("null", "null");
//
//    }
//
//    @Test
//    public void entryCanBeViewedTest() {
//        Entry entry = diary.createEntry("Giving Thanks", "I am grateful");
//      Entry entry1 = diary.createEntry("Thanking God", "I am thankful");
//       Entry entry2 = diary.createEntry("I know me", "I know myself");
//        diary.addEntryIn(entry);
//        diary.addEntryIn(entry1);
//        diary.addEntryIn(entry2);
//        diary.viewAllEntries();
////         diary.viewAllEntries());
//
//    }
//    @Test
//    public void entryCanBeEditedTest(){
//        Entry entry2 = diary.createEntry("I know me", "I know myself");
//        diary.addEntryIn(entry2);
//        diary.editEntry();
//
//
//    }
//
//}
