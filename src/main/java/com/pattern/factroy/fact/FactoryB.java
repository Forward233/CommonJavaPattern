package com.pattern.factroy.fact;

import com.pattern.factroy.simple.Product;
import com.pattern.factroy.simple.ProductB;

public class FactoryB implements Factory {

    @Override
    public Product createProduct() {
        return new ProductB();
    }
}
