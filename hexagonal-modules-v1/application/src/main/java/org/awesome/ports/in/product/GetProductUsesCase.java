package org.awesome.ports.in.product;

import org.awesome.dtos.product.ProductResponse;
import org.awesome.models.Product;

import java.util.List;

public interface GetProductUsesCase {
    List<ProductResponse> getProduct();
}
