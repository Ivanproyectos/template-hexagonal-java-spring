package org.awesome.models;

import lombok.Data;
import org.awesome.valueObjects.Price;

@Data
public class Product {
    private Long id;
    private String name;
    private String description;
    private Price price;
    public Product(Long id, String name, String description, Price price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
    }
}
