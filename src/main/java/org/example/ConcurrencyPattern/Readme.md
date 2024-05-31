## Concurrency Patterns

### Producer-Consumer

Le pattern Producer-Consumer gère la communication entre des processus qui produisent des données et des processus qui les consomment.

````
public class Producer implements Runnable {
    @Override
    public void run() {
        // code du producteur ici
    }
}

public class Consumer implements Runnable {
    @Override
    public void run() {
        // code du consommateur ici
    }
}

````

### Read-Write Lock

Le pattern Reader-Writer Lock contrôle l'accès à une ressource partagée entre plusieurs processus, en accordant l'accès en lecture à plusieurs processus simultanément, mais en accordant l'accès en écriture à un seul processus à la fois.

``````
public class SharedResource {
    private ReadWriteLock lock = new ReentrantReadWriteLock();

    public void read() {
        lock.readLock().lock();
        try {
            // Read operation
        } finally {
            lock.readLock().unlock();
        }
    }

    public void write() {
        lock.writeLock().lock();
        try {
            // Write operation
        } finally {
            lock.writeLock().unlock();
        }
    }
}

``````

### Thread Pool

Le pattern Thread Pool gère un ensemble de threads réutilisables pour exécuter un ensemble de tâches parallèles.

``````
ExecutorService executor = Executors.newFixedThreadPool(3);
for (int i = 0; i < 5; i++) {
    Runnable task = new Task(i);
    executor.execute(task);
}
executor.shutdown();

``````
