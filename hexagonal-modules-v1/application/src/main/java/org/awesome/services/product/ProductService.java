package org.awesome.services.product;

import org.awesome.models.Product;
import org.awesome.ports.in.product.CreateProductUseCase;
import org.awesome.ports.in.product.GetProductUsesCase;
import org.awesome.ports.out.persistence.ProductRepositoryPort;

import java.util.List;

public class ProductService implements GetProductUsesCase, CreateProductUseCase {
    private final ProductRepositoryPort productRepositoryPort;

    public ProductService(ProductRepositoryPort productRepositoryPort) {
        this.productRepositoryPort = productRepositoryPort;
    }
    @Override
    public Product createProduct(Product product) {
        return productRepositoryPort.save(product);
    }

    @Override
    public List<Product> getProduct() {
        return productRepositoryPort.findAll();
    }
}
