package org.awesome.Infrastructure.Configs;

import org.awesome.ports.in.product.CreateProductUseCase;
import org.awesome.ports.in.product.GetProductUsesCase;
import org.awesome.ports.out.persistence.ProductRepositoryPort;
import org.awesome.services.product.ProductService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProductConfig {
    private final ProductRepositoryPort productRepositoryPort;

    public ProductConfig(ProductRepositoryPort productRepositoryPort) {
        this.productRepositoryPort = productRepositoryPort;
    }
    @Bean
    public ProductService productService() {
        return new ProductService(productRepositoryPort);
    }
    @Bean
    public CreateProductUseCase createProductUseCase(ProductService productService) {
        return productService;
    }

    @Bean
    public GetProductUsesCase getProductUsesCase(ProductService productService) {
        return productService;
    }

}
