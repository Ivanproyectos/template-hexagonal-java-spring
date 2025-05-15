package org.awesome.Ports.out.persistence;

import org.awesome.Models.Product;

import java.util.List;

public interface ProductRepositoryPort {
    public List<Product> findAll();
    public Product save(Product product);
}
