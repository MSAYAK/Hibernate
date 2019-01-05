package com.test.model;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanCreater {

	@Bean
	public Employee employee() {
	return new Employee();
}
	@Bean
	public Department department() {
	return new Department();
}

	@Bean
	public Address address() {
	return new Address();
	}
	@Bean
	public NumberGenerator numbergenerator() {
	return new NumberGenerator();
	}
	}
