package org.example.ConcurrencyPattern.ReaderWriterLock;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;



public class Main {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();

        Runnable reader = () -> {
            for (int i = 0; i < 5; i++) {
                sharedResource.read();
            }
        };

        Runnable writer = () -> {
            for (int i = 0; i < 5; i++) {
                sharedResource.write(i);
            }
        };

        Thread readerThread1 = new Thread(reader);
        Thread readerThread2 = new Thread(reader);
        Thread writerThread = new Thread(writer);

        readerThread1.start();
        readerThread2.start();
        writerThread.start();
    }
}

