package com.weiwei.patent.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.weiwei.common.Constants;

@RestController
@RequestMapping(value = Constants.QUERY)
public class PatentQueryController {

	final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@RequestMapping("test")
	public String home() {
		logger.info("info test");
		return "hello world!";
	}
	
}
