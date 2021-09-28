package Threading;

class Hi implements Runnable{
    public void run() {
        for (int i = 0; i < 5; i++)
        {
            System.out.println("Hi");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Hello extends Thread{
    public void run() {
        for (int i = 0; i < 5; i++)
        {
            System.out.println("Hello");
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) throws Exception  {
        Hi obj1 = new Hi();
        Hello obj2 = new Hello();
        Thread t1 = new Thread(obj1);   // By implementing runnable we nned to create thread object
        t1.start();
        obj2.start();
        obj1.run();
        System.out.println( t1.isAlive());
        obj2.run();

        t1.join();
        obj2.join();
        System.out.println( t1.isAlive());
        System.out.println("Bye");
        // instead of calling show we should call run(Earlier method name was show)
       /* obj1.show();
        obj2.show(); */   // Other method has to wait. This can be executed parallelly
    }
}
