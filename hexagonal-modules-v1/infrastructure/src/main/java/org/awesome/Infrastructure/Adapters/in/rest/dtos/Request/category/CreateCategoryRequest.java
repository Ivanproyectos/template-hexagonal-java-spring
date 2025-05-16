package org.awesome.Infrastructure.Adapters.in.rest.dtos.Request.category;

import lombok.Data;
import lombok.Setter;

public record CreateCategoryRequest(
        String name,
        String description,
        String imageUrl,
        Boolean isActive
) {
}
