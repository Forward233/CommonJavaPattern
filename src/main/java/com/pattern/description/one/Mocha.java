package com.pattern.description.one;

/**
 * @ClassName: Mocha
 * @Description: 继承装饰器，Decorator等价于一个装饰品连接被装饰者的桥梁 定义一些装饰者的属性和行为
 * @author: yhl
 * @date: 2019年1月18日 下午9:17:18
 */
public class Mocha implements Beverage {
	private Beverage beverage;

	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
    public String getDescription() {
		String description = "加了摩卡！";
		return beverage.getDescription() + "\n" + description;
	}

	@Override
	public double getPrice() {
		return beverage.getPrice() + 49; // 49表示摩卡的价格
	}

}
