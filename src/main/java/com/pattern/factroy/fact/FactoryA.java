package com.pattern.factroy.fact;

import com.pattern.factroy.simple.Product;
import com.pattern.factroy.simple.ProductA;

public class FactoryA implements Factory {

    @Override
    public Product createProduct() {
        return new ProductA();
    }
}
