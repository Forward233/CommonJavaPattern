package com.pattern.vistit;

/**
 * @ClassName: FinanceDepartment
 * @Description: 处理类1
 * @author: yhl
 * @date: 2019年1月18日 下午9:32:06
 */
public class FinanceDepartment extends Department{

	@Override
	public void Visit(FullTimeEmployee employee) {
		System.out.println("FinanceDepartment--->FullTimeEmployee正在处理");
	}

	@Override
	public void Visit(PartTimeEmployee employee) {
		System.out.println("FinanceDepartment--->PartTimeEmployee正在处理");
	}

}
