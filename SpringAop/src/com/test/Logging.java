package com.test;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Logging {
	
@Pointcut("execution(* com.test.model.*.get*(..))")
private void selectAll() { }

@Before("selectAll()")
public void beforeAdvice() 
{
	System.out.println("Going to setup employee profile");
}

@After("selectAll()")
public void afterAdvice() 
{
	System.out.println("Emp created");
}

@AfterReturning(pointcut="selectAll()", returning= "retVal")
public void afterReturningAdvice(Object retVal)
{
	System.out.println("Returning"+retVal.toString());
}


@AfterThrowing(pointcut="selectAll()",throwing="ex")
	public void AfterThrowingAdvice(NumberFormatException ex) 
{
		System.out.println("exception"+ex.toString());
	}
}

