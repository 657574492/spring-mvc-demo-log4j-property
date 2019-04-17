package com.spring.mvc.log4j.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class TestController {
	 private static Logger logger =LoggerFactory.getLogger(TestController.class);
	/**
	 * 进入同步页面
	 */
	@RequestMapping("/")  
    public String qryList(){
		 logger.info("info");
	     logger.debug("debug");
	     logger.warn("warn");
	     return "index";
	
	}
}
