package org.awesome.Infrastructure.Configs;

import org.awesome.ports.in.category.CreateCategoryUsesCase;
import org.awesome.ports.in.category.GetCategoryUsesCase;
import org.awesome.ports.in.product.CreateProductUseCase;
import org.awesome.ports.in.product.GetProductUsesCase;
import org.awesome.ports.out.persistence.CategoryRepositoryPort;
import org.awesome.ports.out.persistence.ProductRepositoryPort;
import org.awesome.services.category.CategoryService;
import org.awesome.services.product.ProductService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CategoryConfig {
    private final CategoryRepositoryPort categoryRepositoryPort;

    public CategoryConfig(CategoryRepositoryPort categoryRepositoryPort) {
        this.categoryRepositoryPort = categoryRepositoryPort;
    }
    @Bean
    public CategoryService createService() {
        return new CategoryService(categoryRepositoryPort);
    }
    @Bean
    public CreateCategoryUsesCase createCategoryUsesCase(CategoryService categoryService) {
        return categoryService;
    }

    @Bean
    public GetCategoryUsesCase getCategoryUsesCase(CategoryService categoryService) {
        return categoryService;
    }
}
