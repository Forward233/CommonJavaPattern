package com.pattern.factroy.simple;

public class Factory {
	
	public static Product createProduct(String product) {
		if("ProductA".equalsIgnoreCase(product)) {
			return new ProductA();
		}
		if("ProductB".equalsIgnoreCase(product)) {
			return new ProductB();
		}
		return null;
	}
}
