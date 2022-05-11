public class CreditCard     {
    private String customer;
    private String bank;
    private String account;
    private int limit;
    protected double balance;

    public CreditCard(String cust, String bk, String acnt, int lim, double initBal){
        customer = cust;
        bank = bk;
        account = acnt;
        limit = lim;
        balance = initBal;
    }

    public CreditCard(String cust, String bk, String acnt, int lim){
        this(cust,bk,acnt, lim, 0.0);

    }
    public String Customer(){ return customer;};
    public String getBank() {
        return bank;
    }

    public String getAccount() {
        return account;
    }

    public int getLimit() {
        return limit;
    }

    public double getBalance() {
        return balance;
    }

    public boolean charge(double price){
        if(price + balance > limit)
            return false;

        balance += price;
        return true;
    }
public void makePayment(double amount){
        balance -= amount;
}

public static void printSummary(CreditCard card){

    System.out.println("Customer = "+ card.customer);
    System.out.println("Customer = " + card.customer);
    System.out.println("Bank = "+ card.bank);
    System.out.println("Account = " + card.account);
    System.out.println("Balance = " + card.balance);
    System.out.println("Limit = "+ card.limit);

    }


    public static void main(String[] args) {
        CreditCard[] wallet = new CreditCard[3];
        wallet[0] = new CreditCard("John Bowman", "California Savings",
                "5391 03932", 5000);


        wallet[1] = new CreditCard("Ibra Jim", "Canada Savings",
                "5474 68964", 4500);


        wallet[2] = new CreditCard("tommy Bowman", "USA Savings",
                "23672 67450", 7000);

        for (int val = 1; val <= 16; val++) {
            wallet[0].charge(3 * val);
            wallet[1].charge(3 * val);
            wallet[2].charge(3 * val);
        }

        for (CreditCard card : wallet) {
            CreditCard.printSummary(card);

            while (card.getBalance() > 200) {
                card.makePayment(200);
                System.out.println("New balance = " + card.getBalance());
            }

        }


    }
}
