package Threading;

class TestSleepMethod1 extends Thread {
    public void run() {
        for (int i = 1; i < 5; i++) {

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        TestSleepMethod1 t1 = new TestSleepMethod1();
        TestSleepMethod1 t2 = new TestSleepMethod1();

        t1.start();
        t2.start();

        // we have created 2 instances. 2 threads are running. 1st is going to sleep and we get output of the other
        // for loop are running in parallel
    }
}

