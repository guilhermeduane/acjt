package acjavatest;

import acjavatest.robot.HorizontalThread;
import acjavatest.robot.VerticalThread;

public class Robot {
    public static void main(String[] args) {
        HorizontalThread horizontalThread = new HorizontalThread();
        VerticalThread verticalThread = new VerticalThread();

        horizontalThread.start();
        verticalThread.start();
    }
}
