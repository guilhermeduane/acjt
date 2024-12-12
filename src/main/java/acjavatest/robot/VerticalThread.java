package acjavatest.robot;

import java.util.Random;

public class VerticalThread extends Thread {
    private final Random random;

    public VerticalThread() {
        this.random = new Random();
    }

    @Override
    public void run() {
        while (!isInterrupted()) {
            try {
                Thread.sleep(random.nextInt(1000) + 500);
                if (random.nextBoolean()) {
                    System.out.println("Forward...");
                } else {
                    System.out.println("Backward...");
                }
            } catch (InterruptedException e) {
                System.out.println("Vertical thread interrupted.");
            }
        }
    }
}

