package com.cg.lab1_1main;

//Presentation layer would be responsible for handling all user interface and browser communication logic.
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cg.lab1_1config.MyConfig;
import com.cg.lab1_1dao.EmployeeDao;
import com.cg.lab1_1dao.EmployeeDaoImpl;
import com.cg.lab1_1entities.Employee;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
		EmployeeDao eDao = (EmployeeDaoImpl) context.getBean(EmployeeDaoImpl.class);
		Employee employee = eDao.displayEmployeeDetails();
		System.out.println(
				"EMPLOYEE DETAILS------------------------------------------------------------------------------");
		System.out.println(employee);
		System.out.println(
				"----------------------------------------------------------------------------------------------");
	}

}
