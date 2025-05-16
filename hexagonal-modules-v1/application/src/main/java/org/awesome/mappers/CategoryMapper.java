package org.awesome.mappers;

import org.awesome.dtos.category.CategoryDto;
import org.awesome.models.Category;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CategoryMapper {

    CategoryMapper INSTANCE = Mappers.getMapper(CategoryMapper.class);

    CategoryDto toDTO(Category category);

    Category toDomain(CategoryDto dto);
}
