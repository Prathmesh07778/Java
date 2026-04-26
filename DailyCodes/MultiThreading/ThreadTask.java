package DailyCodes.MultiThreading;

import java.util.concurrent.*;

public class ThreadTask extends Thread {

    int taskCount;

    ThreadTask(int taskCount){

        this.taskCount = taskCount;
    }

    
    public void run(){
        System.out.println("Task " + taskCount + " started by " + Thread.currentThread().getName());
        try {
            Thread.sleep(1000); // Simulate work
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Task " + taskCount+ " interrupted.");
        }
        System.out.println("Task " + taskCount + " completed by " + Thread.currentThread().getName());
    }
}

class Task{

    public static void main(String[] args){

        ExecutorService executor = Executors.newFixedThreadPool(3); 
    
        
        for(int i = 1; i<10; i++){
            ThreadTask tt = new ThreadTask(i);
            executor.execute(tt);

        }

        executor.shutdown();
    }
}