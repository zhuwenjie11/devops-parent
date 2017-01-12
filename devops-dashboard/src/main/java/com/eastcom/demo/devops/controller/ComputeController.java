package com.eastcom.demo.devops.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ComputeController {

	private Logger logger = LoggerFactory.getLogger(TimeController.class);
	
	@GetMapping("/addnum")
    String add(@RequestParam Integer a,@RequestParam Integer b) {
		logger.info("call addnum start.");
		RestTemplate rest = new RestTemplate();
		String reuslt = rest.getForEntity("http://devops-compute:8101/add?a="+a+"&b="+b, String.class).getBody();
		logger.info("call addnum end , return result {}",reuslt);
		reuslt +=" test1";
        return reuslt;
    }
	
}
