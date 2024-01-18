package thread;

class HannkimThread extends Thread {
    public HannkimThread(String name) {
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

public class ThreadExample {
    public static void main(String[] args) {
        Thread[] threads = new HannkimThread[5];
        for (int i = 0; i < 5; ++i) {
            threads[i] = new HannkimThread(i + " thread");
            threads[i].start();
        }
    }
}
