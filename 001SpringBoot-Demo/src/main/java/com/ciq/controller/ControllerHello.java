package com.ciq.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class ControllerHello {

	 @RequestMapping("/welcom")
	public String Sayhello() {
		return "home";
		
	}
}
