package org.awesome.dtos.product;

import org.awesome.dtos.category.CategoryResponse;
import org.awesome.models.Category;

import java.util.UUID;

public record ProductResponse(
    UUID id,
    String name,
    String description,
    Double price,
    CategoryResponse category


) {
}
