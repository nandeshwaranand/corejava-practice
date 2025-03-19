package threads;

public class ThreadClass extends Thread{

    public static void main(String[] args) {
        ThreadClass threadClass = new ThreadClass();
        threadClass.start(); // if you call start method thread run method will be automatically called
    }

    @Override
    public void start() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        super.start();
    }

    @Override
    public void run() {
        super.run();
        System.out.println("Run method");
    }
}
