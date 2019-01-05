package com.test.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

@Controller
public class EmpController {


public static void main(String args[])
{
	ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
	EmpService empservice= ctx.getBean("empService1",EmpService.class);
	empservice.addEmp(new Employee());
	Employee e1=ctx.getBean("employee", Employee.class);
	System.out.println(e1);
	empservice.delEmp(e1);
}
}
