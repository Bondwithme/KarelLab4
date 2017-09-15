
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem1 extends Robot
{
    public Problem1(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void escapeRoom() {
        getToEdge();
        checkWall();
    }
    public void getToEdge() {
        while(frontIsClear()) {
            move();
        }
        turnLeft();
    }
    public void checkWall() {
        while(frontIsClear()) {
            move();
            checkRight();
            if(!frontIsClear()) {
                turnLeft();
            }
        }
        
    }
    public void checkRight() {
        turnRight();
        if(frontIsClear()) {
            move();
            turnOff();
        }
        else {
            turnLeft();
        }
    }
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
}

