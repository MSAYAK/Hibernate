package com.test.model;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
private  static EmployeeService service;
public static void main(String args[])
{
 
	ApplicationContext ctx =new ClassPathXmlApplicationContext("applicationContext.xml");
	Employee e1= ctx.getBean("employee",Employee.class);
	System.out.println(e1);
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter name");
	e1.setName(sc.nextLine());
	System.out.println(e1);
	Employee e2= ctx.getBean("employee",Employee.class);
	if(e1.hashCode()==e2.hashCode())
	{
		System.out.println("Equal");
	System.out.println(e1.hashCode());
	System.out.println(e2.hashCode());
	}
	else
	{
		System.out.println("Not Equal");
	System.out.println(e1.hashCode());
	System.out.println(e2.hashCode());
}
service=ctx.getBean("employeeService",EmployeeService.class);
service.addEmployee(e1);

Integer x= ctx.getBean("randomNumber",Integer.class);
System.out.println(x);
	
}}
