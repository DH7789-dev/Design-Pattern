package org.example.CreationalPatterns.Builder;

public class ConcreteBuilder implements Builder {
    private Product product = new Product();

    @Override
    public void buildPart1() {
        product.setPart1("Part1 built");
    }

    @Override
    public void buildPart2() {
        product.setPart2("Part2 built");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
