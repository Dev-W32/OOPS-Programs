package Threading;

public class Multi extends Thread {
    public void run()
    {
        System.out.println("THread is running");
    }
    public static void main(String[] args) {
        Multi t1 = new Multi();
        t1.start(); // start calls the thread so that we dont have to call the run method
    }

}
