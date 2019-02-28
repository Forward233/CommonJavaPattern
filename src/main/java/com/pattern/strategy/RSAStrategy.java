package com.pattern.strategy;

public class RSAStrategy implements IEncryptStrategy{

	public String encryptStr(String params) {
		  return "经过RSA加密过数据";
	}

}
