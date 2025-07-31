package com.example.Week5;

//Tuesday, 22 July 2025
public class Thread3 extends Thread {
//    Tuesday, 22 July 2025

    public static void main(String[] args) {
        Thread3 t3 = new Thread3();

        Thread ttt3 = new Thread(t3);
        ttt3.start();
    }

    @Override
    public void run() {
        System.out.println("HEY");
    }
}
