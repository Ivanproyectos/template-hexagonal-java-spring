package org.awesome.models;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.UUID;

@Data
public class Category {
    private UUID id;
    private String name;
    private String imageUrl;
    private Boolean isActive;

    public Category(UUID id,
                    String name,
                    String imageUrl,
                    Boolean isActive) {
        this.id = id;
        this.name = name;
        this.imageUrl = imageUrl;
        this.isActive = isActive;
    }

    public static Category createCategory(String name, String description, String imageUrl, Boolean isActive) {
        return new Category(UUID.randomUUID(), name, imageUrl, isActive);
    }
}
