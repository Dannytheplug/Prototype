package com.example.Week5;

import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

/*public class SeatAllocation {
    private final AtomicInteger availableSeats = new AtomicInteger(3);

    public synchronized void allocateSeat(String name) {
        if (availableSeats.get() > 0) {
            System.out.println("Seat allocated for " + name + " at " + new Date());
            int remainingSeats = availableSeats.decrementAndGet();
            System.out.println("Available seats: " + remainingSeats);
        } else {
            System.out.println("Sorry " + name + "! No seats available");
        }
    }

    public int getAvailableSeats() {
        return availableSeats.get();
    }
}


import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;*/

public class SeatAllocation {
    private final AtomicInteger availableSeats = new AtomicInteger(3);
    private final AtomicInteger seatCounter = new AtomicInteger(0);

    public synchronized void allocateSeat(String name) {
        if (availableSeats.get() > 0) {
            int seatNumber = seatCounter.incrementAndGet();
            System.out.println("Seat #" + seatNumber + " allocated for " + name + " at " + new Date());
            int remainingSeats = availableSeats.decrementAndGet();
            System.out.println("Available seats: " + remainingSeats);
        } else {
            System.out.println("Sorry " + name + "! No seats available");
        }
    }

    public int getAvailableSeats() {
        return availableSeats.get();
    }
}