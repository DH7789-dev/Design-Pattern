package org.example.BehavioralPatterns.State;

class ConcreteStateB implements State {
    @Override
    public void handle() {
        System.out.println("State B handled");
    }
}
