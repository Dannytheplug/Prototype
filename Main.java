package com.example.Week5;

public class Main {
    public static void main(String[] args) {
        SeatAllocation seatAllocation = new SeatAllocation();

        Runnable task = () -> seatAllocation.allocateSeat(Thread.currentThread().getName());



        Thread t1 = new Thread(task, "Alice");
        Thread t2 = new Thread(task, "Bob");
        Thread t3 = new Thread(task, "Charlie");
        Thread t4 = new Thread(task, "David");  // This one will get "no seats" message

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}