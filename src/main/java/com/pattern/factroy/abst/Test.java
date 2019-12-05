package com.pattern.factroy.abst;

public class Test {

	public static void main(String[] args) {
		Factory factory;
		factory = new FactoryA();
		factory.createProduct();
		factory.createGift();
		
		factory = new FactoryB();
		factory.createProduct();
		factory.createGift();
	}
}
