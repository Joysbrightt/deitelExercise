package tddClass;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public  class KataTest{
    @Test
    public void userInputtingNumberTest(){
        Kata tomisin = new Kata();
        tomisin.userInput(10);
        assertEquals(true, tomisin.userInput(10));

    }
    @Test
    public void ReturningTheBiggestNumbersTest(){
        Kata findingNumber = new Kata();
        findingNumber.returningBiggestNumber(1, 4, 6, 18, 10);
        assertEquals(10, findingNumber.returningBiggestNumber(1, 4, 6, 18, 10));


    }

    @Test
    public void FactoringNumbersTest(){
         Kata multipleOfNumbers = new Kata();
         multipleOfNumbers.factoringNumber(49);
         assertEquals(2, multipleOfNumbers.factoringNumber(49) );

    }

    @Test
    public void CheckingPrimeNumberTest(){
        Kata checkingPrime = new Kata();
        checkingPrime.PrimeNumber(29);
        assertEquals(true,  checkingPrime.PrimeNumber(29) );



    }

}