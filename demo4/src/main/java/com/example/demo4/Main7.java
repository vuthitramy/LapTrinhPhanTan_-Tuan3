package com.example.demo4;

public class Main7 {
    public static void main(String[] args) {
        NumberGenerator numberGenerator1 = new NumberGenerator();
        NumberGenerator numberGenerator2 = new NumberGenerator();

        Thread thread = new Thread(numberGenerator1);
        Thread thread1 = new Thread(numberGenerator2);

        thread.start();
        thread1.start();



    }
}
