package com.example.demo4;

public class NumberGenerator implements Runnable{
    @Override
    public void run(){
        for(int i = 0; i <= 10 ; i++){
            int hashCode;
            System.out.println(i + "hashCode");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
