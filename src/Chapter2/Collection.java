import java.util.Scanner;
public class Collection{

    public static void main(String [] args){

    Scanner input = new Scanner (System.in);

    int firstNumber;
    int secondNumber;
    int thirdNumber;

    System.out.print("Enter the firstNumber");
       input.firstNumber = input.nextInt();

    System.out.print(" Enter the secondNumber");
    input.firstNumber = input.nextInt();

    System.out.print(" Enter the thirdNumber");
       input.thirdNumber = input.nextInt();



    if( (firstNumber > secondNumber) && (firstNumber > thirdNumber)) {
       System.out.print("firstNumber is the largest" +firstNumber);
}



    if( (secondNumber > firstNumber) && (secondNumber > thirdNumber)){
    System.out.print ("firstNumber is the Largest" +secondNumber);
}


    if( (thirdNumber > firstNumber) && (thirdNumber > secondNumber)){
    System.out.print("thirdNumber is the Largest" +thirdNumber);
}

    if( (firstNumber < secondNumber) && (firstNumber <thirdNumber)){
    System.out.print("firstNumber is the smallest" +firstNumber);
}


    if( (secondNumber < firstNumber) && (secondNumber < thirdNumber)){
    System.out.print("secondNumber is the smallest" +secondNumber);
}


    if ( (thirdNumber < firstNumber) && (thirdNumber < secondNumber)){
    System.out.print( "thirdNumber is the smallest" +thirdNumber);
}


    }




}
