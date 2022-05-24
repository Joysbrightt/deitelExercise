package Assignment.Turtle;

import static Assignment.Turtle.Direction.*;

public class Turtle{


    private Pen pen = new Pen();
    private Direction currentDirection= EAST;

    public int[][] getSketchPad() {
        return sketchPad;
    }

    public void setSketchPad(int[][] sketchPad) {
       int[][] sketchhPad = new int[20][20];

//        for ( sketchPad:) {

//        }

        sketchPad = sketchhPad;
    }

    private int[][]sketchPad;

    public Turtle(int[][] sketchPad) {
        this.sketchPad = sketchPad;
    }

    public boolean isPenDown() {
        return pen.isPenDown();
    }


    public void movePenDown() {
        pen.penDown();

    }

    public void movePenUp() {
    pen.penUp();
    }

    public Direction getCurrentDirection() {
        return currentDirection;
    }

    public void turnRight() {
        if (currentDirection ==SOUTH) currentDirection = WEST;
        if (currentDirection == EAST) currentDirection = SOUTH;
        if (currentDirection == WEST) currentDirection = NORTH;

    }

    public void turnLeft() {
        if (currentDirection ==WEST) currentDirection = SOUTH;
        if (currentDirection ==EAST) currentDirection = NORTH;
        if (currentDirection ==NORTH) currentDirection = WEST;

    }



}
