package ChapterThree;

import javax.lang.model.element.Name;

public class ModifiedAccount {
    private String name;
    private double balance;
    private double withdrawal;
    private double deposit;

    public ModifiedAccount(String name, double balance){
         this.name = name;

         if(balance > 0.00) {
             this.balance = balance;
         }


        }


        public void setName(){
            String accountName = "";
            this.name = accountName;

        }

        public String getName(){

            return name;
        }

        public void setBalance(){
        this.balance = balance;

        }

    public double getBalance() {
        return balance;
    }

    public void deposit(double depositAmount){
        {
            balance += depositAmount;
        }
    }
     public void Withdrawal(){
        if(balance != 100){

            double depositAmount = 0;
            balance += depositAmount;
        }else{

            System.out.println("Withdrawal amount exceeded account balance.");
        }
     }

    public double getWithdrawalAmount() {
        return balance;
    }
}




