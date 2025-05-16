package org.awesome.dtos.category;

public record CreateCategoryDto(
        String name,
        String description,
        String imageUrl,
        boolean isActive
) {
}
