package org.awesome.services.product;

import org.awesome.dtos.product.CreateProductRequest;
import org.awesome.dtos.product.ProductResponse;
import org.awesome.mappers.ProductMapper;
import org.awesome.models.Category;
import org.awesome.models.Product;
import org.awesome.ports.in.product.CreateProductUseCase;
import org.awesome.ports.in.product.GetProductUsesCase;
import org.awesome.ports.out.persistence.ProductRepositoryPort;
import org.awesome.valueObjects.Price;

import java.util.List;
import java.util.UUID;

public class ProductService implements GetProductUsesCase, CreateProductUseCase {
   private final ProductMapper productMapper = ProductMapper.INSTANCE;
    private final ProductRepositoryPort productRepositoryPort;

    public ProductService(ProductRepositoryPort productRepositoryPort) {
        this.productRepositoryPort = productRepositoryPort;
    }
    @Override
    public ProductResponse createProduct(CreateProductRequest createProductRequest) {
        var category = new Category(createProductRequest.categoryId(), null, null, null);
        var product = new Product(
                UUID.randomUUID(),
                createProductRequest.name(),
                createProductRequest.description(),
                new Price(createProductRequest.price()),
                category);

        var savedProduct = productRepositoryPort.save(product);
        return productMapper.toDTO(savedProduct);
    }

    @Override
    public List<ProductResponse> getProduct() {
        var products = productRepositoryPort.findAll();
        return productMapper.toDTOs(products);
    }
}
