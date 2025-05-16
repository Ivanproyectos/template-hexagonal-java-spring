package org.awesome.Infrastructure.Adapters.in.rest.dtos.Request.product;

public record CreateProductRequest (
        String title,
        String description,
        double price
){}

