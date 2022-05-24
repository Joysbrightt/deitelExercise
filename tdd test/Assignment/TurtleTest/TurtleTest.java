package Assignment.TurtleTest;

import Assignment.Turtle.Direction;
import Assignment.Turtle.Turtle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class TurtleTest {
    private Turtle turtle;

    @BeforeEach
    public void setUp(){

        turtle = new Turtle(sketchPad);
    }

    @Test
    public void turtleExistedTest(){
        Turtle turtle = new Turtle(sketchPad);
        assertNotNull(turtle);
    }

    @Test
    public void turtlePenIsUpByDefaultTest(){
boolean isPenDown = turtle.isPenDown();
assertFalse(isPenDown);

    }

    @Test
    public void turtleCanMovePenDownTest(){
        turtle.movePenDown();

        assertTrue(turtle.isPenDown());
    }


    @Test
    public void turtleCanMovePenUpTest(){
        turtle.movePenDown();
        turtle.movePenUp();
        assertFalse(turtle.isPenDown());
    }


    @Test
    public void turtleFaceEastByDefaultTest(){

        assertEquals(Direction.EAST, turtle.getCurrentDirection());
    }

    @Test
    public void turtleCanTurnRightFromEastTest(){
        turtle.turnRight();
        assertSame(Direction.SOUTH,turtle.getCurrentDirection());

    }

    @Test
    public void turtleCanTurnRightTwiceFromEastTest(){
        turtle.turnRight();
        turtle.turnRight();
        assertSame(Direction.WEST,turtle.getCurrentDirection());

    }
    @Test public void turtleCanTurnRightTwiceFromEastTst(){

        turtle.turnRight();
        turtle.turnRight();
        turtle.turnRight();
        assertSame(Direction.NORTH, turtle.getCurrentDirection());
    }

    @Test
    public void turtleCanTurnLeftFromWestTest(){
        turtle.turnLeft();
        assertSame(Direction.EAST, turtle.getCurrentDirection());


    }
    @Test
    public void turtleCanTurnLeftTwiceFromWestTest(){
        turtle.turnLeft();
        turtle.turnLeft();
        assertSame(Direction.NORTH, turtle.getCurrentDirection());

    }

    @Test
    public void turtleCanTurnLeftThreeFromWestTest(){
        turtle.turnLeft();
        turtle.turnLeft();
        turtle.turnLeft();
        assertSame(Direction.SOUTH, turtle.getCurrentDirection());

    }




}
