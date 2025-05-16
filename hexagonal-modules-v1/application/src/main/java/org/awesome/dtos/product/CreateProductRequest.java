package org.awesome.dtos.product;

import java.util.UUID;

public record CreateProductRequest(
    String name,
    String description,
    Double price,
    UUID categoryId
) {
}
