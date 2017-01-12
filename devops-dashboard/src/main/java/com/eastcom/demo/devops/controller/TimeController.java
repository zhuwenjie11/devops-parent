package com.eastcom.demo.devops.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class TimeController {
	
	private Logger logger = LoggerFactory.getLogger(TimeController.class);
	
	
	@RequestMapping("/time")
    @ResponseBody
    String home() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		String timeStr = sdf.format(new Date());
		logger.info("now is {}",timeStr);
        return timeStr;
    }

}
