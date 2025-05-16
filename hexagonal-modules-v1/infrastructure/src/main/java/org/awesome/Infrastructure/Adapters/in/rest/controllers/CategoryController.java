package org.awesome.Infrastructure.Adapters.in.rest.controllers;

import org.awesome.dtos.category.CategoryDto;
import org.awesome.dtos.category.CreateCategoryDto;
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
    public ResponseEntity<CategoryDto> createCategory(@RequestBody CreateCategoryDto createCategoryRequest) {
        Category category = Category.createCategory(
                createCategoryRequest.name(),
                createCategoryRequest.description(),
                createCategoryRequest.imageUrl(),
                createCategoryRequest.isActive()
        );

        CategoryDto createdCategory = createCategoryUsesCase.createCategory(createCategoryRequest);

        return  ResponseEntity.ok(createdCategory);
    }
    @GetMapping
    public ResponseEntity<List<CategoryDto>> getCategories() {
        var categories = getCategoryUsesCase.getCategories();

        return ResponseEntity.ok(categories);
    }
}
