package com.example.alphavarient.nonEndPoints.CountDown;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class EODTimer {
    public Date date;
    public static final String formatter ="\r\t\t\t\t\t\t\t\t\t\t\t\t\t\t";

    protected int findHours(long totalSeconds) {
        return Integer.parseInt(String.valueOf(totalSeconds))/3600;
    }
    protected int findMinutes(long totalSeconds) {
        return (Integer.parseInt(String.valueOf(totalSeconds))-(findHours(totalSeconds)*3600))/60;
    }

    protected int findSeconds(long totalSeconds) {
        return Integer.parseInt(String.valueOf(totalSeconds))%60;
    }

    protected void displayTimer(long totalSeconds) {
        System.out.print(formatter);
        System.out.print(findHours(totalSeconds));
        if(findHours(totalSeconds) == 1) {
            System.out.print(" Hour ");
        } else {
            System.out.print(" Hours ");
        }
        System.out.print(findMinutes(totalSeconds));
        if (findMinutes(totalSeconds) == 1) {
            System.out.print(" Minute and ");
        } else {
            System.out.print(" Minutes and ");
        }
        System.out.print(findSeconds(totalSeconds));
        if(findSeconds(totalSeconds) == 1) {
            System.out.print(" Second");
        } else {
            System.out.print(" Seconds");
        }
        System.out.print(" to Leave Office");
    }

    protected void DayRunner(Counter counter) throws InterruptedException {
//        new counter not needed optimized for memory management
//        Counter counter = new Counter();

        long seconds = 1;
        while (Integer.parseInt(String.valueOf(seconds)) != 0) {
            seconds = counter.calculateMinutes(LocalDateTime.now());
//            Moved the formatter outside the function
//            System.out.print("\r\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"  +seconds + " Minutes to MidNight");
            displayTimer(seconds);
            TimeUnit.SECONDS.sleep(1);
        }
    }

    protected void runner() throws InterruptedException {
        Counter counter = new Counter();
        DayRunner(counter);
    }

    public static void main(String a[]){
        EODTimer EODTimer = new EODTimer();
        System.out.println("***************************************************************************  EOD COUNT DOWN  ***************************************************************************\n\n");
        try {
            EODTimer.runner();
        } catch (Exception ex) {
            System.out.println("Exception Occurred "+ex.getMessage());
        }
    }
}

class Counter {
//    Removed the unwanted variable usage
//    public Date date = new Date();
    public LocalDateTime today;
    public LocalDateTime endTime;
    public Counter() {
        today = LocalDateTime.now();
        endTime = today
                .withHour(17)
                .withMinute(30)
                .withSecond(0)
                .withNano(0);
    }

    protected long calculateMinutes(LocalDateTime now) {
//        System.out.println(now);
        return ChronoUnit.SECONDS.between(now,this.endTime);
    }
}
