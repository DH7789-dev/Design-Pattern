package org.example.BehavioralPatterns.ChainofResponsibility;

class ConcreteHandler2 extends Handler {
    @Override
    public void handleRequest(int request) {
        if (request >= 10 && request < 20) {
            System.out.println("ConcreteHandler2 handled the request");
        } else if (successor != null) {
            successor.handleRequest(request);
        }
    }
}
