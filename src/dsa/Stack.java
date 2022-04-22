package dsa;

public class Stack {

//    private  boolean isEmpty = true;
    int numberOfElements;
    private int [] elements =  new int[5];



    public boolean isEmpty() {
        if( numberOfElements == 0) return true;

        else return false;
//        return isEmpty;
    }

    public void push(int element) {
//        isEmpty = false;
        elements[numberOfElements] = element;
        numberOfElements++;


    }

    public int pop() {
//        isEmpty = true;
        numberOfElements--;
        return elements[numberOfElements];
    }


    public int peek() {
        return elements[numberOfElements - 1];
    }
}
