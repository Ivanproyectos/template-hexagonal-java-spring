package org.awesome.Infrastructure.Adapters.in.rest.controllers.product;

import org.awesome.Models.Product;
import org.awesome.Ports.in.product.CreateProductUseCase;
import org.awesome.Ports.in.product.GetProductUsesCase;
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
    public ResponseEntity<Product> createProduct(@RequestBody Product product) {
        return ResponseEntity.ok(createProductUseCase.createProduct(product));
    }

    @GetMapping("/product")
    public ResponseEntity<List<Product>> getProduct() {
        return ResponseEntity.ok(getProductUsesCase.getProduct());
    }
    @GetMapping("/ping")
    public String Ping() {
        return "pong";
    }
}
