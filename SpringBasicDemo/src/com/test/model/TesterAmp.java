package com.test.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TesterAmp {
 public static void main(String args[])
 {
	 ApplicationContext ctx=new AnnotationConfigApplicationContext( BeanCreater.class);
	 NumberGenerator ng=ctx.getBean("numbergenerator",NumberGenerator.class);
	System.out.println(ng.getNumber());

 }
}
