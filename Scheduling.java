package com.example.Week5;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

//Wednesday, 23 July 2025
public class Scheduling {
//    Wednesday, 23 July 2025
    public static void main(String[] args) {
        ScheduledExecutorService schedule = Executors.newScheduledThreadPool(1);

        Runnable task = () -> System.out.println("Running at " + new Date());
        Runnable task1 = () -> System.out.println("Running at " + java.time.LocalDateTime.now());

        schedule.scheduleAtFixedRate(task1, 0, 3, TimeUnit.SECONDS);

    }
}
