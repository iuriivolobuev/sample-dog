package concurrency;

public class ThreadPoolClient {
    public static void main(String[] args) {
        ThreadPoolFixedSize sut = sut(3);
        for (int i = 0; i < 5; i++)
            sut.execute(simpleTask(i, 1000));
        sut.shutdown();
    }

    private static ThreadPoolFixedSize sut(int size) {
        return new ThreadPoolFixedSize(size);
    }

    private static Runnable simpleTask(int taskNumber, long millis) {
        return () -> {
            String taskName = "Task" + taskNumber;
            System.out.println(taskName + " is started.");
            try {
                Thread.sleep(millis);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(taskName + " is completed.");
        };
    }
}
