package org.awesome.ports.in.product;

import org.awesome.models.Product;

import java.util.List;

public interface GetProductUsesCase {
    List<Product> getProduct();
}
