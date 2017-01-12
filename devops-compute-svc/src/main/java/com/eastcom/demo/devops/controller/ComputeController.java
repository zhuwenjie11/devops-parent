package com.eastcom.demo.devops.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ComputeController {

	private Logger logger = LoggerFactory.getLogger(ComputeController.class);
	
	@GetMapping("/add")
	public int add(@RequestParam Integer a , @RequestParam Integer b){
		int result = a + b;
		logger.info("add a={} , b = {} ,result = {}", a , b , result );
		return result;
	}
	
}
