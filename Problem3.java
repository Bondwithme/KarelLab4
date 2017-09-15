 
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem3 extends Robot
{
    public Problem3(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void closeAllWindows() {
        while(!nextToABeeper()) {
            closeWindows();
            move();
            if(!frontIsClear()) {
                turnRight();
            }
        }
        turnOff();
    }
    public void closeWindows() {
        if(checkLeft()) {
            putBeeper();
        }
    }
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public boolean checkLeft() {
        turnLeft();
        if(frontIsClear()) {
            turnRight();
            return true;
        }
        else {
            turnRight();
            return false;
        }
    }
}


