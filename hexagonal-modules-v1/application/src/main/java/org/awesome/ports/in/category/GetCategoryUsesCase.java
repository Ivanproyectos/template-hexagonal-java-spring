package org.awesome.ports.in.category;

import org.awesome.dtos.category.CategoryDto;
import org.awesome.models.Category;

import java.util.List;
import java.util.UUID;

public interface GetCategoryUsesCase {
    public CategoryDto getCategoryById(UUID id);

    public List<CategoryDto> getCategories();
}
