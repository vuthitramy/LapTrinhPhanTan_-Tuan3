package com.example.demo4;

public class Main5 {
    public static void main(String[] args) {
        CountdownRunnable countdownRunnable = new CountdownRunnable();
        Thread countdownThread = new Thread(countdownRunnable);
        countdownThread.start();
    }
}
