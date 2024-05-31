package org.example.ConcurrencyPattern.ReaderWriterLock;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class SharedResource {
    private int resource = 0;
    private ReadWriteLock lock = new ReentrantReadWriteLock();

    public void read() {
        lock.readLock().lock();
        try {
            System.out.println("Read: " + resource);
        } finally {
            lock.readLock().unlock();
        }
    }

    public void write(int value) {
        lock.writeLock().lock();
        try {
            resource = value;
            System.out.println("Write: " + value);
        } finally {
            lock.writeLock().unlock();
        }
    }
}
