package com.example.demo4;

public class Main1 {
    public static int DISTANCE = 100;
    public static int STEP = 2;

    public static void main(String[] args) {
        Car car1 = new Car(" my1");
        Car car2 = new Car(" my2");
        Car car3 = new Car(" my3");

        Thread thread1 = new Thread(car1);
        Thread thread2 = new Thread(car2);
        Thread thread3 = new Thread(car3);

        System.out.println(" Distance: 100KM");
        thread1.start();
        thread2.start();
        thread3.start();


    }
}
