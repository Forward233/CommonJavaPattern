package com.pattern.strategy;

/**
 * @ClassName: IEncryptStrategy
 * @Description: 模式接口，通过实现这个接口，可以实现不同的功能的调用
 * @author: yhl
 * @date: 2019年1月24日 上午9:30:38
 */
public interface IEncryptStrategy {
	
	String encryptStr(String params);

}
