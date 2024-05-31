## Creational Patterns

### Singleton
Le pattern Singleton garantit qu'une classe n'a qu'une seule instance et fournit un point d'accès global à cette instance.

````
public class Singleton {
    private static Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

````
### Factory Method

Le pattern Factory Method définit une interface pour créer un objet, mais laisse les sous-classes choisir la classe concrète à instancier.

````
public interface Product {
    void operation();
}

public class ConcreteProduct implements Product {
    @Override
    public void operation() {
        System.out.println("ConcreteProduct operation");
    }
}

````

### Builder

Le pattern Builder est utilisé pour construire un objet complexe en utilisant une séquence d'étapes. Il permet de construire différents types d'objets à partir d'un même ensemble de composants.

``````
public class Product {
    private String part1;
    private String part2;
    private String part3;

    // Constructeur privé pour empêcher l'instanciation directe
    private Product(Builder builder) {
        this.part1 = builder.part1;
        this.part2 = builder.part2;
        this.part3 = builder.part3;
    }

    public static class Builder {
        private String part1;
        private String part2;
        private String part3;

        public Builder() {}

        public Builder part1(String part1) {
            this.part1 = part1;
            return this;
        }

        public Builder part2(String part2) {
            this.part2 = part2;
            return this;
        }

        public Builder part3(String part3) {
            this.part3 = part3;
            return this;
        }

        public Product build() {
            return new Product(this);
        }
    }
}

``````

### Prototype

Le pattern Prototype permet de créer de nouveaux objets en copiant un objet existant, connu sous le nom de prototype.
 
``````
public abstract class Prototype implements Cloneable {
    @Override
    public Prototype clone() throws CloneNotSupportedException {
        return (Prototype) super.clone();
    }
}

public class ConcretePrototype extends Prototype {
    private String field;

    public ConcretePrototype(String field) {
        this.field = field;
    }

    public String getField() {
        return field;
    }
}

``````
