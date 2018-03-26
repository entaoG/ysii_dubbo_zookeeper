package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.test.service.TestService;
import javax.annotation.Resource; 

/**
 * 
 * ≤‚ ‘
 * @author yskkysll
 *
 */
@Controller 	
public class testController {
	
	 
	 @Resource(name = "testService")  
	 TestService testInterface;  
	  
	@RequestMapping(value = { "/consumer/testMain" })
	@ResponseBody
	public String testDubbo() {
		return "consuemr02" + testInterface.test();
	}
}




