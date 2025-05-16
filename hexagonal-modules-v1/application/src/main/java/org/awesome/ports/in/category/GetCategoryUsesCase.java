package org.awesome.ports.in.category;

import org.awesome.dtos.category.CategoryResponse;

import java.util.List;
import java.util.UUID;

public interface GetCategoryUsesCase {
    public CategoryResponse getCategoryById(UUID id);

    public List<CategoryResponse> getCategories();
}
