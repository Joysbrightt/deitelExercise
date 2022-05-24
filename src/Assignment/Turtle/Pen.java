package Assignment.Turtle;

public class Pen {

    private boolean isDown;

    public boolean isPenDown(){
        return isDown;
    }

    public void penUp(){
        isDown = false;
    }
    public void penDown(){
        isDown = true;
    }




}
