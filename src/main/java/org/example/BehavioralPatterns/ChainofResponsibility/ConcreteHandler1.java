package org.example.BehavioralPatterns.ChainofResponsibility;

class ConcreteHandler1 extends Handler {
    @Override
    public void handleRequest(int request) {
        if (request >= 0 && request < 10) {
            System.out.println("ConcreteHandler1 handled the request");
        } else if (successor != null) {
            successor.handleRequest(request);
        }
    }
}
