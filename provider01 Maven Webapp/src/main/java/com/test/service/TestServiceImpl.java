package com.test.service;

import com.test.service.TestService;




/**
 * 
 * @author yskkysll
 *
 */
public class TestServiceImpl implements TestService{

	public String test() {
		System.out.println("test success");
		return "provider01";
	}

}
