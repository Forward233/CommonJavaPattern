package com.pattern.description;


/**
 * @ClassName: Milk
 * @Description: 继承装饰器，Decorator等价于一个装饰品连接被装饰者的桥梁 定义一些装饰者的属性和行为
 * 				 构造函数传入具体的被装饰者对象，进行装饰
 * @author: yhl
 * @date: 2019年1月18日 下午9:15:49
 */
public class Milk implements Beverage {

	private Beverage beverage;

	public Milk(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		String description = "加了牛奶！";
		return beverage.getDescription() + "\n" + description;
	}

	@Override
	public double getPrice() {
		return beverage.getPrice() + 20; // 20表示牛奶的价格
	}

}
