package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.model.Address;
import com.test.model.Department;
import com.test.model.Employee;

public class App {
public static void main(String args[])
{
	ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
	Employee e = ctx.getBean("employee",Employee.class);
	e.setId(101);
	e.setName("Mayank");
	e.setRaisedSalary(1000);
	e.setDept(new Department());
	e.setAddress(new Address());
	int id=e.getId();
	System.out.println(id);
	String name=e.getName();
	System.out.println(name);
	System.out.println(e.getRaisedSalary());
}
}
