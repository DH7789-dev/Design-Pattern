## Behavioral Patterns

### Observer

Le pattern Observer définit une dépendance un-à-plusieurs entre objets, de sorte que lorsque l'objet observé change d'état, tous ses observateurs sont notifiés et mis à jour automatiquement.

````
public interface Observer {
    void update();
}

public class ConcreteObserver implements Observer {
    @Override
    public void update() {
        System.out.println("ConcreteObserver updated");
    }
}

````

### Strategy

Le pattern Strategy définit une famille d'algorithmes, encapsule chacun d'eux et les rend interchangeables. Il permet de choisir l'algorithme à utiliser au moment de l'exécution.

``````
public interface Strategy {
    void execute();
}

public class ConcreteStrategyA implements Strategy {
    @Override
    public void execute() {
        System.out.println("Executing strategy A");
    }
}

``````

### Command

Le pattern Command encapsule une requête en tant qu'objet, permettant de paramétrer des clients avec des requêtes, de mettre en file d'attente des requêtes et de supporter l'annulation des opérations.

````
public interface Command {
    void execute();
}

public class ConcreteCommand implements Command {
    private Receiver receiver;

    @Override
    public void execute() {
        receiver.action();
    }
}

````

### Iterator

Le pattern Iterator fournit un moyen de parcourir séquentiellement les éléments d'une collection sans exposer la représentation sous-jacente.

``````
public interface Iterator<T> {
    boolean hasNext();
    T next();
}

public class ConcreteIterator<T> implements Iterator<T> {
    private List<T> items;
    private int position = 0;

    public ConcreteIterator(List<T> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return position < items.size();
    }

    @Override
    public T next() {
        if (!hasNext()) {
            return null;
        }
        T currentItem = items.get(position);
        position++;
        return currentItem;
    }
}

``````

### Chain of Responsibility

Le pattern Chain of Responsibility permet de passer une requête le long d'une chaîne de gestionnaires. Lorsqu'une requête est reçue, chaque gestionnaire décide de la traiter ou de la transmettre au gestionnaire suivant de la chaîne.

``````
public abstract class Handler {
    protected Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public abstract void handleRequest(int request);
}

public class ConcreteHandler1 extends Handler {
    @Override
    public void handleRequest(int request) {
        if (request >= 0 && request < 10) {
            System.out.println("ConcreteHandler1 handled the request");
        } else if (successor != null) {
            successor.handleRequest(request);
        }
    }
}

public class ConcreteHandler2 extends Handler {
    @Override
    public void handleRequest(int request) {
        if (request >= 10 && request < 20) {
            System.out.println("ConcreteHandler2 handled the request");
        } else if (successor != null) {
            successor.handleRequest(request);
        }
    }
}

``````

### State

Le pattern State permet à un objet de changer son comportement lorsqu'il change son état interne. L'objet paraît changer de classe.

````````
public interface State {
    void handle();
}

public class ConcreteStateA implements State {
    @Override
    public void handle() {
        System.out.println("State A handled");
    }
}

public class ConcreteStateB implements State {
    @Override
    public void handle() {
        System.out.println("State B handled");
    }
}

public class ContextState {
    private State state;

    public void setState(State state) {
        this.state = state;
    }

    public void request() {
        state.handle();
    }
}

````````
