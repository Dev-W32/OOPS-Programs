package Threading;

public class Main2 implements Runnable {
    public void run()
    {
        System.out.println("Thread running");
    }

    public static void main(String[] args) {
        Main2 m1 = new Main2();
        Thread t1 = new Thread(m1);
        // mandatory because our object would not be treated as a thread object
        t1.start();
    }
}
