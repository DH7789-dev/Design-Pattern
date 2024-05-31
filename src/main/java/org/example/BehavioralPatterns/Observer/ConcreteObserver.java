package org.example.BehavioralPatterns.Observer;

public class ConcreteObserver implements Observer {
    @Override
    public void update() {
        System.out.println("ConcreteObserver updated");
    }
}
