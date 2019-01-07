package com.test.container;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controller1 {
@RequestMapping({"/login","/signup"})
public String req1() {
	return "Success";

	}

}
