package org.awesome.Infrastructure.Adapters.in.rest.controllers;

import org.awesome.Infrastructure.Adapters.in.rest.dtos.Request.category.CreateCategoryRequest;
import org.awesome.Infrastructure.Adapters.in.rest.dtos.Response.CategoryResponse;
import org.awesome.models.Category;
import org.awesome.ports.in.category.CreateCategoryUsesCase;
import org.awesome.ports.in.category.GetCategoryUsesCase;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/category")
public class CategoryController {
    private final CreateCategoryUsesCase createCategoryUsesCase;
    private final GetCategoryUsesCase getCategoryUsesCase;

    public CategoryController(CreateCategoryUsesCase createCategoryUsesCase, GetCategoryUsesCase getCategoryUsesCase) {
        this.createCategoryUsesCase = createCategoryUsesCase;
        this.getCategoryUsesCase = getCategoryUsesCase;
    }

    @PostMapping
    public ResponseEntity<CategoryResponse> createCategory(@RequestBody CreateCategoryRequest createCategoryRequest) {
        Category category = Category.createCategory(
                createCategoryRequest.name(),
                createCategoryRequest.description(),
                createCategoryRequest.imageUrl(),
                createCategoryRequest.isActive()
        );

        Category createdCategory = createCategoryUsesCase.createCategory(category);
        CategoryResponse categoryResponse = new CategoryResponse(
                createdCategory.getId(),
                createdCategory.getName(),
                createdCategory.getDescription(),
                createdCategory.getImageUrl(),
                createdCategory.getIsActive()
        );
        return  ResponseEntity.ok(categoryResponse);
    }
    @GetMapping
    public ResponseEntity<List<CategoryResponse>> getCategories() {
        var categories = getCategoryUsesCase.getCategories();

        List<CategoryResponse> categoryResponses = categories.stream()
                .map(category -> new CategoryResponse(
                        category.getId(),
                        category.getName(),
                        category.getDescription(),
                        category.getImageUrl(),
                        category.getIsActive()
                ))
                .toList();
        return ResponseEntity.ok(categoryResponses);
    }
}
