package org.example.ConcurrencyPattern.ProducerConsumer;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

class Producer implements Runnable {
    private BlockingQueue<String> queue;

    public Producer(BlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            queue.put("Product");
            System.out.println("Produced: Product");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}




