package com.pattern.vistit;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: EmployeeList
 * @Description: 数据结构容器类
 * @author: yhl
 * @date: 2019年1月18日 下午9:31:49
 */
public class EmployeeList {
	
	 private List<IEmployee> empLists = new ArrayList<IEmployee>();;
	 
	 public void AddEmployee(IEmployee emp)
     {
         this.empLists.add(emp);
     }
	 
	 // 重点 处理传入的不同类型department
	 public void accept(Department department) {
		 for (IEmployee empList : empLists) {
			 empList.accept(department);
		 }
	 }
}
