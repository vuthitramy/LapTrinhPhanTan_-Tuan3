package com.example.demo4;

public class Maim3 {
    public static void main(String[] args) {
        EvenNumbersRunnable evenNumbersRunnable = new EvenNumbersRunnable();
        Thread evenThread = new Thread(evenNumbersRunnable);
        evenThread.start();
    }
}
