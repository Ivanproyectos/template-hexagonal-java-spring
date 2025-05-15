package org.awesome.Models;

import lombok.Data;

@Data
public class Product {
    private Long id;
    private String name;
    private String description;
    private double price;
    public Product(Long id, String name, String description, double price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
    }
}
