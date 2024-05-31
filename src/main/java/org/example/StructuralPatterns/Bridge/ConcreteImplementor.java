package org.example.StructuralPatterns.Bridge;

public class ConcreteImplementor implements Implementor {
    @Override
    public void operationImpl() {
        System.out.println("ConcreteImplementor operationImpl");
    }
}
