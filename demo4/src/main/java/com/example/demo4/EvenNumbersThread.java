package com.example.demo4;

public class EvenNumbersThread extends Thread{
    public void run() {
        for (int i = 2; i <= 10; i += 2) {
            System.out.println(i);
        }
    }
}


