package org.awesome.ports.out.persistence;

import org.awesome.models.Product;

import java.util.List;

public interface ProductRepositoryPort {
     List<Product> findAll();
    public Product save(Product product);
}
