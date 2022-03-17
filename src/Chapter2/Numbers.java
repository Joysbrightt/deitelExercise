import java.lang.Math.*;
public class Numbers{

    public static void main(String [] args){

    Scanner input = new Scanner(System.in);

    float a,b;
    System.out.printf("%s  %s  %s" ,   "a" , "b" , "pow(a, b)");

    a=1;
    b=2;
    System.out.printf(" %n%.0f  %.0f    %.0f" , a,b,Math.pow(a, b));

a++;
b++;
System.out.printf(" %n%.0f  %.0f       %.0f" , a,b,Math.pow(a, b));

a++;
b++;
System.out.printf(" %n%.0f  %.0f       %.0f" , a,b,Math.pow(a, b));

a++;
b++;
System.out.printf(" %n%.0f  %.0f      %.0f" , a,b,Math.pow(a, b));

a++;
b++;
System.out.printf(" %n%.0f  %.0f      %.0f" , a,b, Math.pow(a, b));

a++;
b++;
System.out.printf(" %n%.0f  %.0f    %.0f" , a,b, Math.pow(a, b));


}

}
