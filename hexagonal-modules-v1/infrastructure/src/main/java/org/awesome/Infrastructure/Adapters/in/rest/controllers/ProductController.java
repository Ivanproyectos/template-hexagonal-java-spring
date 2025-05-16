package org.awesome.Infrastructure.Adapters.in.rest.controllers;

import jakarta.validation.Valid;
import org.awesome.dtos.product.CreateProductRequest;
import org.awesome.dtos.product.ProductResponse;
import org.awesome.models.Product;
import org.awesome.ports.in.product.CreateProductUseCase;
import org.awesome.ports.in.product.GetProductUsesCase;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {

    private final GetProductUsesCase getProductUsesCase;
    private final CreateProductUseCase createProductUseCase;

    public ProductController(GetProductUsesCase getProductUsesCase,
                             CreateProductUseCase createProductUseCase) {
        this.getProductUsesCase = getProductUsesCase;
        this.createProductUseCase = createProductUseCase;
    }

    @PostMapping("/product")
    public ResponseEntity<ProductResponse> createProduct(@RequestBody @Valid CreateProductRequest createProductRequest) {
        return ResponseEntity.ok(createProductUseCase.createProduct(createProductRequest));
    }

    @GetMapping("/product")
    public ResponseEntity<List<ProductResponse>> getProduct() {
        return ResponseEntity.ok(getProductUsesCase.getProduct());
    }

    @GetMapping("/ping")
    public String Ping() {
        return "pong";
    }
}
