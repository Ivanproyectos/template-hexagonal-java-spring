package org.awesome.dtos.product;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.UUID;

public record CreateProductRequest(
    @NotNull
    @Size(min = 3, max = 50)
    String name,
    @NotNull
    @Size(min = 3, max = 500)
    String description,
    @NotNull
    Double price,
    @NotNull
    UUID categoryId
) {
}
