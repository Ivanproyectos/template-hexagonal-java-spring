package org.awesome.Infrastructure.Adapters.out.persistence.entities;

import lombok.Data;
import org.awesome.models.Product;

@Data
public class ProductEntity {
    private Long id;
    private String name;
    private String description;
    private double price;

    public ProductEntity(Long id, String name, String description, double price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
    }

/*    public static ProductEntity fromDomainModel(Product product) {
        return new ProductEntity(product.getId(), product.getName(), product.getDescription(), product.getPrice());
    }*/

 /*   public Product toDomainModel() {
        return new Product(id, name, description, price);
    }*/
}
