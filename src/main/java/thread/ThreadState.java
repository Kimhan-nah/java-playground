package thread;

import thread.utils.SleepThread;

public class ThreadState {

    public static void main(String[] args) {
        Thread thread = new SleepThread();
        System.out.println("Thread State: " + thread.getState());   // NEW
        thread.start();
        System.out.println("Thread State: " + thread.getState());   // RUNNABLE

        try {
            Thread.sleep(1000);
            System.out.println("Thread State: " + thread.getState());   // TIMED_WAITING (시간에 따라 RUNNABLE 나올 수도 있음)
            thread.join();
            System.out.println("Thread State: " + thread.getState());   // TERMINATED
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
