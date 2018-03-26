package com.test.service;


/**
 * 
 * @author yskkysll
 *
 */
public class TestServiceImpl implements TestService{

	public String test() {
		System.out.println("test success");
		return "provider02";
	}

}
