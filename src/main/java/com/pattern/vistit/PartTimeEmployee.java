package com.pattern.vistit;

/**
 * @ClassName: PartTimeEmployee
 * @Description: 数据类型
 * @author: yhl
 * @date: 2019年1月18日 下午9:33:36
 */
public class PartTimeEmployee implements IEmployee {

	public String Name;
	public double HourWage;
	public int WorkTime;

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public double getHourWage() {
		return HourWage;
	}

	public void setHourWage(double hourWage) {
		HourWage = hourWage;
	}

	public int getWorkTime() {
		return WorkTime;
	}

	public void setWorkTime(int workTime) {
		WorkTime = workTime;
	}

	public PartTimeEmployee(String name, double hourWage, int workTime) {
		super();
		Name = name;
		HourWage = hourWage;
		WorkTime = workTime;
	}

	public void accept(Department department) {
		department.Visit(this);
	}

}
