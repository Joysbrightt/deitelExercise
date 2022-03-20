package tddClass;

public class Kata {


    public boolean userInput(int i) {
        int number = i % 2;
        if (number == 0) {
            return true;
        }
        return false;
    }

    public int returningBiggestNumber(int numb, int numb1, int numb2, int numb3, int numb4) {


        if (numb > numb1 && numb > numb2 && numb > numb3 && numb > numb4)
            return numb;
        else
            if (numb1 > numb && numb1 > numb2 && numb1 > numb3 && numb1 > numb4)
            return numb1;
        else
            if (numb2 > numb && numb2 > numb2 && numb2 > numb3 && numb2 > numb4)
            return numb2;
        else
            if (numb3 > numb && numb3 > numb1 && numb3 > numb2 && numb2 > numb4)
            return numb3;
        else return numb4;
    }

    public int factoringNumber(int digit) {
        int numb = 1;
        int number;
        for (number = 1; number < digit; ++number) ;
        if (digit % number == 0) {
            numb++;
        }
        return numb;
    }

    public boolean PrimeNumber(int b) {
        int number = 0;
        int num = 0;
        for (number = 1; number <= b; number++) {
            int counter =0;
            for ( b=number; b>=1; b--){
                if(number% b ==0){
                    counter = counter +1;
                }
                return true;
            }
        }
        return false;
    }
}
