package com.lnt.mvc.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lnt.mvc.exception.CustomException;
import com.lnt.mvc.model.EmployeeDetails;

import com.lnt.mvc.service.IEmployeeDetailsService;

@Controller
public class EmployeeDetailsController {
	private IEmployeeDetailsService iEmployeeDetailsService;
	
	@Autowired
	public void setiEmployeeDetailsService(IEmployeeDetailsService iEmployeeDetailsService) {
		this.iEmployeeDetailsService = iEmployeeDetailsService;
	}
	
	
	@RequestMapping(value = "/employee", method = RequestMethod.GET)
	public String listEmployees(Model model) 
	{
		model.addAttribute("employee", new EmployeeDetails());// model
		model.addAttribute("listEmployees", 
				this.iEmployeeDetailsService.listEmpDetails());
		return "employee";// view name
	}
	
	

	



	@RequestMapping(value = "/employee/add", method = RequestMethod.GET)
	@ExceptionHandler({CustomException.class})
	public String addEmployee(@ModelAttribute("employee") 
	@Valid EmployeeDetails e,
			BindingResult result,Model model) {
		if(!result.hasErrors()) {
			if(e.getEmployeeid()==0) {
				//new person add
				this.iEmployeeDetailsService.addDetails(e);	
			}
			else
			{
				this.iEmployeeDetailsService.updateDetails(e);
			}
			
		}
		return "redirect:/employee";
	}
	
}
