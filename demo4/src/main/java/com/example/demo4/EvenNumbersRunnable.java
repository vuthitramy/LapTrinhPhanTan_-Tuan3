package com.example.demo4;

public class EvenNumbersRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 2; i <= 10; i += 2) {
            System.out.println(i);
        }
    }
}
