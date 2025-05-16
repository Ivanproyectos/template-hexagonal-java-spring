package org.awesome.ports.in.category;

import org.awesome.dtos.category.CategoryResponse;
import org.awesome.dtos.category.CreateCategoryRequest;

public interface CreateCategoryUsesCase {
    public CategoryResponse createCategory(CreateCategoryRequest category);
}
