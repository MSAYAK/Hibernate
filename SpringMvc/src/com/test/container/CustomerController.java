package com.test.container;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	@RequestMapping("/adduser")
	public String add()
	{
		return "add";
	}
	@RequestMapping("/deluser")
	public String del()
	{
		return "delete";
	}
	@RequestMapping("/updateuser")
	public String update()
	{
		return "update";
	}
	@RequestMapping("/listuser")
	public String list()
	{
		return "list";
	}

}
