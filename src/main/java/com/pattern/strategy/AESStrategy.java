package com.pattern.strategy;

/**
 * @ClassName: AESStrategy
 * @Description: 实现AES加密
 * @author: yhl
 * @date: 2019年1月24日 上午9:32:51
 */
public class AESStrategy implements IEncryptStrategy{

	public String encryptStr(String params) {
		 return "经过AES加密过的数据";
	}
}
