package Ebanking;

public class Accounting {
   private final String ACCOUNT_NUMBER;
   private final String fullName;
   private int balance;
   private String pin;

    public Accounting(String accountNumber, String firstName, String lastName, String pinNumber) {
   ACCOUNT_NUMBER = accountNumber;
   this.fullName = lastName + "" + firstName;
   pin = pinNumber;

    }

    public String getAccountNumber() {

        return ACCOUNT_NUMBER;
    }

    public  String getFullName(){
        return fullName;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public int getBalance(String pin){
        if (pin.equals(this.pin))return balance;

        return 0;
    }

    public void withdraw(int amount, String pinNumber) {
        if (this.pin.equals(pinNumber));
        balance -= amount;
    }

    @Override
    public String toString(){
        return String.format("""
                Account Name: %6s
                AccountNumber: %6s
                Balance: %6d
                """, fullName,ACCOUNT_NUMBER, balance);
    }







}
