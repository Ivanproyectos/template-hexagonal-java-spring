package org.awesome.services.category;

import org.awesome.dtos.category.CategoryResponse;
import org.awesome.dtos.category.CreateCategoryRequest;
import org.awesome.mappers.CategoryMapper;
import org.awesome.ports.in.category.CreateCategoryUsesCase;
import org.awesome.ports.in.category.GetCategoryUsesCase;
import org.awesome.ports.out.persistence.CategoryRepositoryPort;
import org.awesome.models.Category;

import java.util.List;
import java.util.UUID;

public class CategoryService implements CreateCategoryUsesCase, GetCategoryUsesCase {

    private final CategoryMapper categoryMapper = CategoryMapper.INSTANCE;
    private final CategoryRepositoryPort categoryRepositoryPort;

    public CategoryService(CategoryRepositoryPort categoryRepositoryPort) {
        this.categoryRepositoryPort = categoryRepositoryPort;
    }

    @Override
    public CategoryResponse createCategory(CreateCategoryRequest createCategory) {
        var category = categoryMapper.toDomain(createCategory);
        category.setId(UUID.randomUUID());

        var categoryCreated = categoryRepositoryPort.save(category);

        return categoryMapper.toDTO(categoryCreated);
    }
    @Override
    public CategoryResponse getCategoryById(UUID id) {
        var category = categoryRepositoryPort.findById(id);
        if (category == null) {
            return null;
        }
        return categoryMapper.toDTO(category);
    }

    @Override
    public List<CategoryResponse> getCategories() {
        var categories = categoryRepositoryPort.findAll();
        return categoryMapper.toDTOs(categories);

    }
}
