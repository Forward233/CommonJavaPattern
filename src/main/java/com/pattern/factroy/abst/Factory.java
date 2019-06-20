package com.pattern.factroy.abst;


import com.pattern.factroy.simple.Product;

public interface Factory {
    public Product createProduct();

    public Gift createGift();
}
