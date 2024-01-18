package thread.utils;

public class ThreadUtils {
    public static Thread createThread(String name) {
        return new SleepThread(name);
    }

    public static Thread[] createThreads(int n) {
        Thread[] threads = new Thread[n];
        for (int i = 0; i < n; ++i) {
            threads[i] = createThread("Thread " + i);
        }
        return threads;
    }

    public static void startThreads(Thread[] threads) {
        for (Thread thread : threads) {
            thread.start();
        }
    }

    public static void joinThreads(Thread[] threads) throws InterruptedException {
        for (Thread thread : threads) {
            thread.join();
        }
    }
}
