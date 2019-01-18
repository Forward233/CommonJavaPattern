package com.pattern.description;

/**
 * @ClassName: Soy
 * @Description: 继承装饰器，Decorator等价于一个装饰品连接被装饰者的桥梁
 * 				  定义一些装饰者的属性和行为
 * @author: yhl
 * @date: 2019年1月18日 下午9:17:24
 */
public class Soy extends Decorator{
	private String description = "加了豆浆！";
	private Beverage beverage = null;
	public Soy(Beverage beverage){
		this.beverage = beverage;
	}
	public String getDescription(){
		return beverage.getDescription()+"\n"+description;
	}
	public double getPrice(){
		return beverage.getPrice()+30;	//30表示豆浆的价格
	}

}
