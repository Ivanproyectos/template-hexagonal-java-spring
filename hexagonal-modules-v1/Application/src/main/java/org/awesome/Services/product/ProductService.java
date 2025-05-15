package org.awesome.Services.product;

import org.awesome.Models.Product;
import org.awesome.Ports.in.product.CreateProductUseCase;
import org.awesome.Ports.in.product.GetProductUsesCase;
import org.awesome.Ports.out.persistence.ProductRepositoryPort;

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
