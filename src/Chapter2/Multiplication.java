import java.util.Scanner;

public class Multiplication{

public static void main(String [] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter x");
int x = input.nextInt();

System.out.print("Enter y");
int y = input.nextInt();

int tripplex = (x * 3);



int doubley = ( y * 2);


if( tripplex % doubley == 0){
System.out.println(" the number " + tripplex + " is a multiple of " + doubley);

}
else

{System.out.println("the number " + tripplex + "  is not a multiple of " + doubley);
}



}


}
