package com.example.firstrestapispring.product.support;

import com.example.firstrestapispring.product.support.exception.ProductNotFoundException;

import java.util.function.Supplier;

public class ProductExceptionSupplier {

    public static Supplier<ProductNotFoundException> productNotFound(Long id)  {
        return () -> new ProductNotFoundException(id);
    }
}
