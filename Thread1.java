package com.example.Week5;

//Tuesday, 22 July 2025
public class Thread1 implements Runnable {
//    Tuesday, 22 July 2025
    @Override
    public void run() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        Thread1 t = new Thread1();
        t.run();
    }

    /*
    public class Thread1 extends Thread {
    @Override
    public void run() {
        System.out.println("Yo");
    }

    public static void main(String[] args) {
        Thread1 thread = new Thread1();
        thread.run();

    }
    }*/
}

