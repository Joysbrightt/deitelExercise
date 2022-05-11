package DiaryProject;

import java.util.ArrayList;

public class Diary {
    private String name;
    private String password;
    private int numberOfEntries;
    private ArrayList<Entry> entries;


    public Diary(String name, String password){
        this.name = name;
        this.password = password;
        entries = new ArrayList<Entry>();
    }


    public void setName(){

        this.name = name;
    }

    public String getName() {
        return name;
    }


    public void setpassword(String password) {
        this.password = password;

    }

    public String getpassword() {
        return password;
    }



    public Entry createEntry(String title, String body) {
        Entry entry = new Entry(title, body);
    return entry;
    }


    public void addEntryIn(Entry entry) {
        entries.add(entry);
        numberOfEntries +=1;
    }

    public void removeEntry(Entry entry) {
        entries.remove(entry);
        numberOfEntries -= 1;
    }

    public void viewAllEntries() {
        for (int i = 0; i < entries.size(); i++) {
            Entry entry = entries.get(i);
            System.out.println(entry.getDate() + "\n "+ entry.getTitle() +"\n"+ entry.getBody(" "));
        }
    }

    public void editEntry() {
        for (int i = 2; i <entries.size() ; i++) {
            Entry entry = entries.get(i);

             entry.getBody("being matured has to do with having adequate sense of reasoning ");
            }
    }


//    view all entries

//    lock/ unlock entry
//    find entry
//    edit an entry

}
