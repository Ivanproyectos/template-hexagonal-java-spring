package org.awesome.ports.in.product;

import org.awesome.dtos.product.CreateProductRequest;
import org.awesome.dtos.product.ProductResponse;
import org.awesome.models.Product;

public interface CreateProductUseCase {
    public ProductResponse createProduct (CreateProductRequest product);
}
