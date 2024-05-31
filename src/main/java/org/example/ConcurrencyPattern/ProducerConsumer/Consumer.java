package org.example.ConcurrencyPattern.ProducerConsumer;

import java.util.concurrent.BlockingQueue;

class Consumer implements Runnable {
    private BlockingQueue<String> queue;

    public Consumer(BlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            String product = queue.take();
            System.out.println("Consumed: " + product);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
