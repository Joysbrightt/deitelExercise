package ChpaterOne;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class BigDecimalForMoney {

    @Test

    void TestAddTest(){

        BigDecimal money= new BigDecimal( "30.20");
        BigDecimal gbese = BigDecimal.valueOf(22.0);
        DecimalFormat formatter = new DecimalFormat();
        formatter.setGroupingUsed(true);
        formatter.setGroupingSize(4);
        System.out.println(formatter.format(money));



        // testing for format using time

        LocalDateTime tomisin = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("E, MM-dd-yy hm:mm:s a");
        System.out.println(dateTimeFormatter.format(tomisin));
    }
}
