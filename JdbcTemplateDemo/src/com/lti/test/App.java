package com.lti.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.dao.EmpDao;
import com.lti.model.Employee;

public class App {
public static void main(String args[])
{
	ApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
	EmpDao empdao=(EmpDao) context.getBean("employeeDaoImpl");
	Employee e=context.getBean("employee",Employee.class);
	e.setEage(24);
	e.setEname("Kunal");
	e.setSalary(1000);
	empdao.create(e);
	 
	
	Employee e1=context.getBean("employee",Employee.class);
	e1.setEage(25);
	e1.setEname("Kiran");
	e1.setSalary(2000);
	empdao.create(e1);
	
	Employee e2=context.getBean("employee",Employee.class);
	e2.setEage(18);
	e2.setEname("Arjun");
	e2.setSalary(1500);
	empdao.create(e2);
	
	List<Employee> elist=empdao.listEmployees();
	for(Employee emp:elist) {
	System.out.println(emp);	
	}
	empdao.delete(103);
	empdao.update(102, 30);
	empdao.getEmployee(102);
	
	Data d1=context.getBean("data",Data.class);
	d1.findSum();
	}
}
