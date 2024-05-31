package org.example.BehavioralPatterns.State;

class ConcreteStateA implements State {
    @Override
    public void handle() {
        System.out.println("State A handled");
    }
}
