package org.awesome.dtos.category;

public record UpdateCategoryDto(
        String name,
        String description,
        String imageUrl,
        boolean isActive
) {
}
