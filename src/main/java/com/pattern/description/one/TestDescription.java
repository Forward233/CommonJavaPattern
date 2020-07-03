package com.pattern.description.one;

public class TestDescription {
	
	public static void main(String[] args) {
		// 创建一个具体的被装饰者对象
		Beverage beverage = new CoffeeBean1();
		// 创建装饰品，装饰被装饰者对象
		beverage = new Mocha(beverage);		
		beverage = new Milk(beverage);
		beverage = new Soy(beverage);
		System.out.println(beverage.getDescription()+"\n价格："+beverage.getPrice());

	}

}
