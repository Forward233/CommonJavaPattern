package com.pattern.singleton;

/**
 * @ClassName: SingletonOne
 * @Description: 写法一：饿汉模式
 * 				  优点：这种写法比较简单，就是在类装载的时候就完成实例化。避免了线程同步问题。
 * 				  缺点：在类装载的时候就完成实例化，没有达到Lazy Loading的效果。如果从始至终从未使用过这个实例，则会造成内存的浪费。
 * @author: yhl
 * @date: 2019年1月22日 上午9:50:22
 */
public class SingletonOne {
	
	private final static SingletonOne INSTANCE = new SingletonOne(); 
	
	private SingletonOne() {
	}
	
	private static SingletonOne getSingletonOne() {
		return INSTANCE;
	}

}
