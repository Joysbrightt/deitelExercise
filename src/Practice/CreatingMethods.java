package Practice;

public class CreatingMethods {
    public static void main(String[] args) {

CreatingMethods.multiplicationTable(40,20);
    }
public static void multiplicationTable(int multipleOf, int limit){
    for (int i = 1; i <= limit; i++) {
        System.out.printf(" %d * %d = %d%n",multipleOf,i, multipleOf * i);


    }

}
}