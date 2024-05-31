## Structural Patterns
### Adapter

Le pattern Adapter permet à des interfaces incompatibles de travailler ensemble en enveloppant l'objet avec une classe adaptateur qui agit comme un convertisseur entre deux interfaces.

``````
public class Adapter implements Target {
    private Adaptee adaptee;

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}

``````

### Bridge
Le pattern Bridge sépare l'abstraction d'une implémentation, de sorte que les deux puissent varier indépendamment.

``````
public abstract class Abstraction {
    protected Implementor implementor;

    public Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }

    public abstract void operation();
}

``````

### Composite
Le pattern Composite compose les objets dans des structures d'arbre pour représenter une hiérarchie tout-partie.

``````
public class Composite implements Component {
    private List<Component> components = new ArrayList<>();

    @Override
    public void operation() {
        for (Component component : components) {
            component.operation();
        }
    }
}

``````

### Decorator

Le pattern Decorator permet d'attacher de nouvelles responsabilités à un objet dynamiquement. Il fournit une alternative souple à la sous-classe pour étendre la fonctionnalité.

``````
public interface Component {
    void operation();
}

public class ConcreteComponent implements Component {
    @Override
    public void operation() {
        System.out.println("ConcreteComponent operation");
    }
}

public abstract class Decorator implements Component {
    protected Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        component.operation();
    }
}

public class ConcreteDecorator extends Decorator {
    public ConcreteDecorator(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        addedBehavior();
    }

    private void addedBehavior() {
        System.out.println("Added behavior");
    }
}

``````

### Facade

Le pattern Facade fournit une interface unifiée pour un ensemble d'interfaces dans un sous-système. Il définit une interface de niveau supérieur qui simplifie l'utilisation du sous-système.

``````
public class Subsystem1 {
    public void operation1() {
        System.out.println("Subsystem1 operation1");
    }
}

public class Subsystem2 {
    public void operation2() {
        System.out.println("Subsystem2 operation2");
    }
}

public class Facade {
    private Subsystem1 subsystem1;
    private Subsystem2 subsystem2;

    public Facade() {
        subsystem1 = new Subsystem1();
        subsystem2 = new Subsystem2();
    }

    public void operation() {
        subsystem1.operation1();
        subsystem2.operation2();
    }
}

``````

### Proxy

Le pattern Proxy fournit un substitut ou un espace réservé pour un autre objet afin de contrôler l'accès à celui-ci.

``````
public interface Subject {
    void request();
}

public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("RealSubject request");
    }
}

public class Proxy implements Subject {
    private RealSubject realSubject;

    @Override
    public void request() {
        if (realSubject == null) {
            realSubject = new RealSubject();
        }
        realSubject.request();
    }
}

``````
