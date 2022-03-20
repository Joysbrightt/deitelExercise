package Chapter2;

import java.util.Scanner;

public class Multiplication{

public static void main(String [] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter x: ");
int numbx = input.nextInt();

System.out.print("Enter y: ");
int numby = input.nextInt();

int tripplex = (numbx * 3);



int doubley = ( numby * 2);


if( tripplex % doubley == 0){
System.out.println(" the number " + tripplex + " is a multiple of " + doubley);

}
else

{System.out.println("the number " + tripplex + "  is not a multiple of " + doubley);
}

}


}
