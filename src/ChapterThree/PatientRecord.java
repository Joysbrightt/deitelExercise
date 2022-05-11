package ChapterThree;

public class PatientRecord {
    private String firstName;
    private String LastName;
    private int dateOfBirth;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public PatientRecord(String firstName, String lastName, int dateOfBirth, String gender) {
        this.firstName = firstName;
        LastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
    }

    private String gender;


    public String getPatientName() {
        return firstName;
    }
}
