package Assignment13;

import java.util.Random;


class generateRandominteger extends Thread {
    public void run() {
        Random random = new Random();
        int i = random.nextInt(1000);
        System.out.println("Number is: " + i);
        if (i % 2 == 0) {
            checkEven even = new checkEven(i);
            even.start();
        } else {
            checkOdd odd = new checkOdd(i);
            odd.start();
        }
    }
}

class checkEven extends Thread {

    int i;

    checkEven(int i) {
        this.i = i;
    }

    public void run() {


        System.out.println("Even number ");
        System.out.println("Square is: " + i * i);

    }
}

class checkOdd extends Thread {
    int i;

    checkOdd(int i) {
        this.i = i;
    }

    public void run() {
        System.out.println("Odd Number");
        System.out.println("Cube is: " + i * i * i);

    }
}

public class MultiThreadApp {
    public static void main(String[] args) {
        generateRandominteger gen = new generateRandominteger();
        gen.start();

    }
}
