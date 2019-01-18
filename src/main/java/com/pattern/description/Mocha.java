package com.pattern.description;

/**
 * @ClassName: Mocha
 * @Description: 继承装饰器，Decorator等价于一个装饰品连接被装饰者的桥梁 定义一些装饰者的属性和行为
 * @author: yhl
 * @date: 2019年1月18日 下午9:17:18
 */
public class Mocha extends Decorator {
	private String description = "加了摩卡！";
	private Beverage beverage = null;

	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}

	public String getDescription() {
		return beverage.getDescription() + "\n" + description;
	}

	public double getPrice() {
		return beverage.getPrice() + 49; // 30表示摩卡的价格
	}

}
