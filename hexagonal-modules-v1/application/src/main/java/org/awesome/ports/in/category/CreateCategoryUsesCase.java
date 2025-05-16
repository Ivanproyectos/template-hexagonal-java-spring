package org.awesome.ports.in.category;

import org.awesome.dtos.category.CategoryDto;
import org.awesome.dtos.category.CreateCategoryDto;
import org.awesome.models.Category;

public interface CreateCategoryUsesCase {
    public CategoryDto createCategory(CreateCategoryDto category);
}
