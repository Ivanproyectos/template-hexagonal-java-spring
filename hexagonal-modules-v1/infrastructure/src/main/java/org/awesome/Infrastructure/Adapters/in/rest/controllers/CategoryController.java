package org.awesome.Infrastructure.Adapters.in.rest.controllers;

import org.awesome.dtos.category.CategoryResponse;
import org.awesome.dtos.category.CreateCategoryRequest;
import org.awesome.ports.in.category.CreateCategoryUsesCase;
import org.awesome.ports.in.category.GetCategoryUsesCase;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

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
        CategoryResponse createdCategory = createCategoryUsesCase.createCategory(createCategoryRequest);

        return  ResponseEntity.ok(createdCategory);
    }
    @GetMapping
    public ResponseEntity<List<CategoryResponse>> getCategories() {
        var categories = getCategoryUsesCase.getCategories();
        return ResponseEntity.ok(categories);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CategoryResponse> getCategory(@PathVariable UUID id) {
        var category = getCategoryUsesCase.getCategoryById(id);
        return ResponseEntity.ok(category);
    }
}
