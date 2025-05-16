package org.awesome.mappers;

import org.awesome.dtos.product.CreateProductRequest;
import org.awesome.dtos.product.ProductResponse;
import org.awesome.models.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ProductMapper {
    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);

    @Mapping(target = "price", expression = "java(product.getPrice() != null ? product.getPrice().value() : null)")
    ProductResponse toDTO(Product product);

    List<ProductResponse> toDTOs(List<Product> products);

    @Mapping(target = "price", expression = "java(dto.price() != null ? new Price(dto.price()) : null)")
    Product toDomain(CreateProductRequest dto);

}
