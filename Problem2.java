
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem2 extends Robot
{
    public Problem2(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void plantBeepers() {
        while(!nextToABeeper()) {
            putBeeper();
            rightTurn();
            checkWallLeft();
        }
        turnOff();
    }
    public void checkWallLeft() {
        turnLeft();
        if(!frontIsClear()) {
            turnRight();
            move();
        }
        else {
            move();
            turnLeft();
            putBeeper();
            move();
        }
    }
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public boolean checkLeft() {
        turnLeft();
        if(!frontIsClear()) {
            turnRight();
            return true;
        }
        else {
            turnRight();
            return false;
        }
    }
    public boolean checkFront() {
        if(!frontIsClear()) {
            return true;
        }
        else {
            return false;
        }
    }
    public void rightTurn() {
        if(checkLeft() && checkFront()) {
            turnRight();
        }
    }
}

