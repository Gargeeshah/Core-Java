package com.practice.executorframework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class PrintJob implements Runnable
{
    String name;
    PrintJob(String name){
        this.name = name;

    }
    @Override
    public void run() {
        System.out.println(name+" Job started by thread "+Thread.currentThread().getName());
        try {
            Thread.sleep(5000);
        }
        catch(InterruptedException e) {}
        System.out.println(name+" job completed by thread "+Thread.currentThread().getName());
    }

}
public class ExecuterServiceDemo {

    public static void main(String[] args) {

        PrintJob[] jobs = {new PrintJob("abc"),
                new PrintJob("pqr"),
                new PrintJob("abcde"),
                new PrintJob("xyz")
        };

        ExecutorService service = Executors.newFixedThreadPool(3);
        for(PrintJob job:jobs) {
            service.submit(job);
        }
        service.shutdown();
    }

}

