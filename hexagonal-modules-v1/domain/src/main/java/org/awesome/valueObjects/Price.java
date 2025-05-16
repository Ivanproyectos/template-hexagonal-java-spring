package org.awesome.valueObjects;

public record Price(double value) {
    public Price {
        if (value < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }
    }
}
