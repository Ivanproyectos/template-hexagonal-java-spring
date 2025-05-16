package org.awesome.mappers;

import org.awesome.dtos.category.CategoryResponse;
import org.awesome.dtos.category.CreateCategoryRequest;
import org.awesome.models.Category;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface CategoryMapper {

    CategoryMapper INSTANCE = Mappers.getMapper(CategoryMapper.class);

    CategoryResponse toDTO(Category category);
    List<CategoryResponse> toDTOs(List<Category> categories);
    Category toDomain(CreateCategoryRequest dto);

}
