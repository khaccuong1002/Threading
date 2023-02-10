package com.codegym;

public class TestThread {
    public static void main(String[] args) {
        OddThread oddThread = new OddThread();
        EvenThread evenThread = new EvenThread();

        Thread thread1 = new Thread(oddThread);
        Thread thread2 = new Thread(evenThread);

        thread1.start();
        try {
            thread1.join();
        }catch (InterruptedException e){
            System.out.println("Loi");
        }
        thread2.start();
    }
}
