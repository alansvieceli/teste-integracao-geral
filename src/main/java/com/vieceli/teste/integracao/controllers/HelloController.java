package com.vieceli.teste.integracao.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@Value("${application.title}")
	private String applicationTitle;
	
	@RequestMapping("/")
	public String index() {
		return applicationTitle;
	}

}
