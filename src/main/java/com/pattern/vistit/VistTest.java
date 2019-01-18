package com.pattern.vistit;

public class VistTest {
	
	public static void main(String[] args) {
		EmployeeList empList = new EmployeeList();
		
		// 定义不同的数据类型
        IEmployee fteA = new FullTimeEmployee("梁思成", 3200.00, 45);
        IEmployee fteB = new FullTimeEmployee("徐志摩", 2000, 40);
        IEmployee fteC = new FullTimeEmployee("梁徽因", 2400, 38);
        IEmployee fteD = new PartTimeEmployee("方鸿渐", 80, 20);
        IEmployee fteE = new PartTimeEmployee("唐宛如", 60, 18);

        // 放入数据容器
        empList.AddEmployee(fteA);
        empList.AddEmployee(fteB);
        empList.AddEmployee(fteC);
        empList.AddEmployee(fteD);
        empList.AddEmployee(fteE);
        
        // 调用容器中的方法处理
        Department department = new FinanceDepartment();
        Department department2 = new HRDepartment();
        empList.accept(department);
        System.out.println("------------");
        empList.accept(department2);
        
	}

}
