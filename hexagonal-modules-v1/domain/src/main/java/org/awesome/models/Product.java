package org.awesome.models;

import lombok.Data;
import org.awesome.valueObjects.Price;

import java.util.UUID;

@Data
public class Product {
    private UUID id;
    private String name;
    private String description;
    private Price price;
    private Category category;
    public Product(UUID id,
                   String name,
                   String description,
                   Price price,
                   Category category) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
    }
}
