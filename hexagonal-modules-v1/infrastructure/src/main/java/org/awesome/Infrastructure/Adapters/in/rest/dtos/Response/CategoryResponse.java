package org.awesome.Infrastructure.Adapters.in.rest.dtos.Response;

import java.util.UUID;

public record CategoryResponse(UUID id,
                               String name,
                               String description,
                               String imageUrl,
                               Boolean isActive
) {
}

