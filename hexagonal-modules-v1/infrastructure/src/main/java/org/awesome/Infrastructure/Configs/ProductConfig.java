package org.awesome.Infrastructure.Configs;

import org.awesome.Ports.in.product.CreateProductUseCase;
import org.awesome.Ports.in.product.GetProductUsesCase;
import org.awesome.Ports.out.persistence.ProductRepositoryPort;
import org.awesome.Services.product.ProductService;
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
