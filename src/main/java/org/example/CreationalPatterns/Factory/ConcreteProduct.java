package org.example.CreationalPatterns.Factory;

public class ConcreteProduct implements Product {
    @Override
    public void operation() {
        System.out.println("ConcreteProduct operation");
    }
}
