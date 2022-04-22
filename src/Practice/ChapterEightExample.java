package Practice;

public class ChapterEightExample {



    public double calculateTakeHomePay(double basicSalary){

        double takeHomePay = basicSalary;
//        double tenPercent = 10/(100*1.0);
//        takeHomePay += calculateTransportAllowancefrom(basicSalary);
//        takeHomePay += calculateFeedingAllowanceFrom(basicSalary);
//        takeHomePay -= calculateTaxFrom(basicSalary);


        return takeHomePay + calculateTransportAllowancefrom(basicSalary)
                + calculateFeedingAllowanceFrom(basicSalary) - calculateTaxFrom(basicSalary);
    }


    private double calculateTransportAllowancefrom(double basicSalary){
        final double TEN_PERCENT = 0.1;

        return TEN_PERCENT * basicSalary;
    }

    private final double TEN_PERCENT = 0.1;

    private double calculateFeedingAllowanceFrom(double basicSalary){

        final double THREE_PERCENT = 0.3;
        double feedingAllowance = (THREE_PERCENT * basicSalary);

        return THREE_PERCENT * basicSalary;
    }

    private double calculateTaxFrom(double basicSalary){

        final double TWO_PERCENT = 0.02;

        double tax = TWO_PERCENT * basicSalary;

        return TWO_PERCENT * basicSalary;
    }

}
