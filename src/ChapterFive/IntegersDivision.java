package ChapterFive;

public class IntegersDivision {

    public int sumOfInteger(){
int sum = 0;
        for (int i = 1; i <=30 ; i++) {

            if (i % 3 ==0)
             sum +=i;
        }
        System.out.println(sum);

        return sum;
    }

    public static void main(String[] args) {

        IntegersDivision integersDivision = new  IntegersDivision();
        integersDivision.sumOfInteger();
    }

}
