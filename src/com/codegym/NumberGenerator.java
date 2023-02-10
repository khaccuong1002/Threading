package com.codegym;

public class NumberGenerator implements Runnable {
    private int generator;

    public NumberGenerator(int generator) {
        this.generator = generator;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++){
                System.out.println(i + " is " + generator);
                Thread.sleep(500);
            }
        } catch (InterruptedException e){
            System.out.println("Lỗi chương trình");
        }
    }

}
