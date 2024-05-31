package org.example.StructuralPatterns.Composite;

public class Leaf implements Component {
    @Override
    public void operation() {
        System.out.println("Leaf operation");
    }
}
