package org.awesome.dtos.category;

import java.util.UUID;

public record CategoryDto(
        UUID id,
        String name,
        String description,
        String imageUrl,
        boolean isActive
) {
}
