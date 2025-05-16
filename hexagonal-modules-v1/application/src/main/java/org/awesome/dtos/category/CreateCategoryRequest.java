package org.awesome.dtos.category;

public record CreateCategoryRequest(
        String name,
        String description,
        String imageUrl,
        boolean isActive
) {
}
