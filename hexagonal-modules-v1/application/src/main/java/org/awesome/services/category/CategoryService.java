package org.awesome.services.category;

import org.awesome.dtos.category.CategoryDto;
import org.awesome.dtos.category.CreateCategoryDto;
import org.awesome.ports.in.category.CreateCategoryUsesCase;
import org.awesome.ports.in.category.GetCategoryUsesCase;
import org.awesome.ports.out.persistence.CategoryRepositoryPort;
import org.awesome.models.Category;

import java.util.List;
import java.util.UUID;

public class CategoryService implements CreateCategoryUsesCase, GetCategoryUsesCase {

    private final CategoryRepositoryPort categoryRepositoryPort;

    public CategoryService(CategoryRepositoryPort categoryRepositoryPort) {
        this.categoryRepositoryPort = categoryRepositoryPort;
    }

    @Override
    public CategoryDto createCategory(CreateCategoryDto createCategory) {
        var category = new Category(
                UUID.randomUUID(),
                createCategory.name(),
                createCategory.description(),
                createCategory.imageUrl(), createCategory.isActive());

        var categoryCreated = categoryRepositoryPort.save(category);

        return new CategoryDto(
                categoryCreated.getId(),
                categoryCreated.getName(),
                categoryCreated.getDescription(),
                categoryCreated.getImageUrl(),
                categoryCreated.getIsActive()
        );
    }
    @Override
    public CategoryDto getCategoryById(UUID id) {
        var category = categoryRepositoryPort.findById(id);
        if (category == null) {
            return null;
        }
        return new CategoryDto(
                category.getId(),
                category.getName(),
                category.getDescription(),
                category.getImageUrl(),
                category.getIsActive()
        );
    }

    @Override
    public List<CategoryDto> getCategories() {
        var categories = categoryRepositoryPort.findAll();
        return categories.stream()
                .map(category -> new CategoryDto(
                        category.getId(),
                        category.getName(),
                        category.getDescription(),
                        category.getImageUrl(),
                        category.getIsActive()))
                .toList();

    }
}
