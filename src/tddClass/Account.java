package tddClass;

public class Account {
    private static String name;
    private int accountNumber;

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Account() {
        accountNumber = 1;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
}
