package org.awesome.Infrastructure.Adapters.out.persistence.repositories;

import org.awesome.Infrastructure.Adapters.out.persistence.entities.ProductEntity;
import org.awesome.Models.Product;
import org.awesome.Ports.out.persistence.ProductRepositoryPort;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository implements ProductRepositoryPort {
    public static List<ProductEntity> products = new ArrayList<>();

    @Override
    public List<Product> findAll() {
        return products.stream().map(ProductEntity::toDomainModel).toList();
    }

    @Override
    public Product save(Product product) {
        ProductEntity productEntity = ProductEntity.fromDomainModel(product);
        products.add(productEntity);
        return productEntity.toDomainModel();
    }
}
