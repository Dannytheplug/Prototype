package com.example.Week5;

//Tuesday, 22 July 2025
public class Thread4 extends Thread {
//    Tuesday, 22 July 2025
    public static int amount = 0;

    public static void main(String[] args) {
        Thread4 t4 = new Thread4();
        System.out.println(amount);
        t4.start();

        amount ++;
        System.out.println(amount);
        amount--;
        System.out.println(amount);
    }

    @Override
    public void run() {
        amount++;
    }
}
