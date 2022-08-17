import org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class RoverTest {
    Rover rover;
    @Before
    public void setUp() throws Exception {
        rover = new Rover(0,0, Direction.NORTH);
        rover.createMap(rover);
    }
    @Test
    public void TestRoverNorth(){
        rover.resolveInstructions(rover, "FFLFRB");
        assertEquals(-1,rover.getX(),0);
        assertEquals(1,rover.getY(),0);
        assertEquals(Direction.NORTH, rover.getDirection());
    }
    @Test
    public void TestRoverEast(){
        rover.setPosition(1,5,Direction.EAST);
        rover.resolveInstructions(rover, "FFLFRBFFR");
        assertEquals(4,rover.getX(),0);
        assertEquals(6,rover.getY(),0);
        assertEquals(Direction.SOUTH, rover.getDirection());
    }
    @Test
    public void TestRoverSouth(){
        rover.setPosition(2,3,Direction.SOUTH);
        rover.resolveInstructions(rover, "FFLFRBFFR");
        assertEquals(3,rover.getX(),0);
        assertEquals(0,rover.getY(),0);
        assertEquals(Direction.WEST, rover.getDirection());
    }
    @Test
    public void TestRoverWest(){
        rover.setPosition(3,5,Direction.WEST);
        rover.resolveInstructions(rover, "FFLFRBFFR");
        assertEquals(0,rover.getX(),0);
        assertEquals(4,rover.getY(),0);
        assertEquals(Direction.NORTH, rover.getDirection());
    }
}
