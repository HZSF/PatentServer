package com.weiwei.patent.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "manage")
public class PatentManageController {

	@RequestMapping("test")
	public String home() {
		return "hello manage!";
	}
	
}
