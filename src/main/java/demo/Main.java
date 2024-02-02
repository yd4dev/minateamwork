package demo;

import fopbot.Direction;
import fopbot.Robot;
import fopbot.World;

public class Main {
    public static void main(String[] args) {
        World.setSize(9, 9);
        Robot myRobot = new Robot(4, 4, Direction.UP, 38);
        World.setVisible(true);
        while (myRobot.isFrontClear()) myRobot.move();
        myRobot.turnLeft();
        while (myRobot.isFrontClear()) myRobot.move();

        for (int i = 0; i < 4; i++) {
            myRobot.turnLeft();
            while (myRobot.isFrontClear()){
                myRobot.putCoin();
                myRobot.move();
            }
        }
        myRobot.turnLeft();
        for (int i = 0; i < 4; i++) if (myRobot.isFrontClear()) myRobot.move();
        myRobot.turnLeft();
        for (int i = 0; i < 4; i++) if (myRobot.isFrontClear()) myRobot.move();
        myRobot.turnLeft();

    }

    public void rotateTo(Direction direction, Robot robot) {
        while (robot.getDirection() != direction) {
            robot.turnLeft();
        }
    }
}
