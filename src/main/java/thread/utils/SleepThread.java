package thread.utils;
public class SleepThread extends Thread {
    public SleepThread() {
        super();
    }
    public SleepThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Hello, I'm " + getName());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Bye, I'm " + getName());
    }
}
