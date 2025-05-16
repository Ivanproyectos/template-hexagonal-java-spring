package org.awesome.dtos.category;

public record UpdateCategoryRequest(
        String name,
        String description,
        String imageUrl,
        boolean isActive
) {
}
