package acjavatest.robot;

import java.util.Random;

public class HorizontalThread extends Thread {
    private final Random random;

    public HorizontalThread() {
        this.random = new Random();
    }

    @Override
    public void run() {
        while (!isInterrupted()) {
            try {
                Thread.sleep(random.nextInt(1000) + 500);
                if (random.nextBoolean()) {
                    System.out.println("Left...");
                } else {
                    System.out.println("Right...");
                }
            } catch (InterruptedException e) {
                System.out.println("Horizontal thread interrupted.");
            }
        }
    }
}
