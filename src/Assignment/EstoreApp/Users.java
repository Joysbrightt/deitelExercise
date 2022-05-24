package Assignment.EstoreApp;

public class Users {
private String name;
private int age;
private  String emailAddress;
private String homeAddress;
private String password;
private int phoneNumber;
private Customer customer;
private Sellers sellers;
private Admin admin;

public void setName(){

    this.name = name;

}

    public int getAge() {
        return age;
    }

    public String getEmailAddress(){
    this.emailAddress = emailAddress;
    return emailAddress;
    }

    public String getHomeAddress(){
    this.homeAddress = homeAddress;
    return homeAddress;
    }

    public String getPassword(){
    this.password = password;
    return password;
    }

    public int getPhoneNumber(){
        return phoneNumber;
    }


}
