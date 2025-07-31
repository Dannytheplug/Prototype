package com.example.Week5;

//Tuesday, 22 July 2025
public class Thread2 extends Thread{
//    Tuesday, 22 July 2025
    @Override
    public void run() {
        System.out.println("Runner");
    }

    public static void main(String[] args) {
        Thread2 t2 = new Thread2();
        t2.start();
    }
}

