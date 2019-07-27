package com.padrao.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "demo")
public class TranslaterController {

	@RequestMapping( method = RequestMethod.GET)
	public String index() {
		return "demo/index";
	}
	
}
