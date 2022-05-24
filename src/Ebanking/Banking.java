package Ebanking;

public class Banking {
   private final String name;
    public int getNumberOfCustomers;
    private Accounting[] accounts;
   private int numberOfCustomer;

   public Banking(String bankName, int numberOfCustomer) {
       name = bankName;
       accounts = new Accounting[numberOfCustomer];
   }

   public String getName(){
       return name;
   }

   public int getMaximumNoOfCustomers(){

       return accounts.length;
   }

   public Accounting createAccountFor(String firstName, String lastName, String pinNumber) {
  String accountNumber = (numberOfCustomer + 1)+"";
       Accounting account = new Accounting(accountNumber, firstName, lastName,pinNumber);

        accounts[numberOfCustomer] =account;
        return account;

   }

   public int getNumberOfCustomer() {
       return numberOfCustomer;
   }

   public Accounting findAccount(int accountNumber){
       int indexOfAccount = accountNumber -1;
       Accounting theAccount = accounts[indexOfAccount];
//       return theAccount;
       return  accounts[accountNumber -1];
   }


    public void deposit(int amount, String accountNumber) {
       Accounting account = findAccount(Integer.parseInt(accountNumber));
        account.deposit(amount);

    }


    public void withdraw(int amount, String accountNumber, String pinNumber) {
       Accounting account = findAccount(Integer.parseInt(accountNumber));
       account.withdraw(amount, pinNumber);

    }


    public void transfer(int amount, String from, String to, String sendersPin) {
       Accounting senderAccount = findAccount(Integer.parseInt(from));
       Accounting receiverAccount = findAccount(Integer.parseInt(to));
       senderAccount.withdraw(amount,sendersPin);
       receiverAccount.deposit(amount);



    }
}
