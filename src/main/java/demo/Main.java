package demo;

import fopbot.Direction;
import fopbot.Robot;
import fopbot.World;

public class Main {
    public static void main(String[] args) {
        World.setSize(9, 9);
        Robot myRobot = new Robot(4, 4, Direction.UP, 38);
        World.setVisible(true);
    }
}
