package thread.utils;
public class SleepThread extends Thread {
    public SleepThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Hello, I'm " + getName());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Bye, I'm " + getName());
    }
}
