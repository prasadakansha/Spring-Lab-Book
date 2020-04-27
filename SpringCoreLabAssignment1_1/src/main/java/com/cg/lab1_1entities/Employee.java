package com.cg.lab1_1entities;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/*
 * JavaBeans are classes that encapsulate many objects into a single object (the
 * bean). 
 * It is a java class that should follow following conventions: 
 * 1.Must implement Serializable. 
 * 2.It should have a public no-arg constructor. 
 * 3.All properties in java bean must be private with public getters and setter methods.
 */
@Component
public class Employee {
	@Value("12345")
	private int employeeId;
	@Value("Harriet")
	private String employeeName;
	@Value("40000")
	private double salary;
	@Value("PES-BU")
	private String businessUnit;
	@Value("30")
	private int age;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getBusinessUnit() {
		return businessUnit;
	}

	public void setBusinessUnit(String businessUnit) {
		this.businessUnit = businessUnit;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", salary=" + salary
				+ ", businessUnit=" + businessUnit + ", age=" + age + "]";
	}

}
