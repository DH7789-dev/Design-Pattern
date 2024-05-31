package org.example.CreationalPatterns.Builder;

public interface Builder {
    void buildPart1();

    void buildPart2();

    Product getResult();
}
