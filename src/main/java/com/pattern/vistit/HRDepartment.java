package com.pattern.vistit;

/**
 * @ClassName: HRDepartment
 * @Description: 处理类2
 * @author: yhl
 * @date: 2019年1月18日 下午9:32:28
 */
public class HRDepartment extends Department{

	@Override
	public void Visit(FullTimeEmployee employee) {
		System.out.println("HRDepartment--->FullTimeEmployee正在处理");
	}

	@Override
	public void Visit(PartTimeEmployee employee) {
		System.out.println("HRDepartment--->PartTimeEmployee正在处理");
	}

}
