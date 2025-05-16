package org.awesome.dtos.category;

import java.util.UUID;

public record CategoryResponse(
        UUID id,
        String name,
        String imageUrl,
        Boolean isActive
) {
}
