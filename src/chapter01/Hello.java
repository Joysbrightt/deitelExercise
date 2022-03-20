package chapter01;

public class Hello<counter> {
    public static void main(String[] args) {
        int numb = 1;
        while (numb < 10) {
            System.out.printf("%d  ", numb);
            ++numb;
        }
        System.out.println();

    }
}
