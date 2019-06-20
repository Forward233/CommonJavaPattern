package com.pattern.factroy.abst;

import com.pattern.factroy.simple.Product;
import com.pattern.factroy.simple.ProductA;

public class FactoryA implements Factory {

    @Override
    public Product createProduct() {
        return new ProductA();
    }

    @Override
    public Gift createGift() {
        return new GiftA();
    }

}
