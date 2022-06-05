package concurrency;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

class ThreadPoolFixedSize {
    private final BlockingQueue<Runnable> tasks;
    private volatile boolean running = true;

    public ThreadPoolFixedSize(int size) {
        this.tasks = new LinkedBlockingDeque<>();
        for (int i = 0; i < size; i++)
            new Thread(new Worker()).start();
    }

    public void execute(Runnable command) {
        if (!this.running)
            throw new RuntimeException("Isn't possible to add tasks after shutdown.");
        boolean offered = this.tasks.offer(command);
        if (!offered)
            throw new RuntimeException("Couldn't add task to queue.");
    }

    public void shutdown() {
        this.running = false;
    }

    private class Worker implements Runnable {
        @Override public void run() {
            while (running || tasks.size() > 0) {
                Runnable task = tasks.poll();
                if (task != null)
                    task.run();
            }
        }
    }
}
