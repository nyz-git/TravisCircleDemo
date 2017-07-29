package com.stackroute.ci.continuosintegration;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class SumTestCases {

	private static App app;
	
	@BeforeClass
	public static void init() throws Exception {
		
		
	}
	
	@Test
	public void AddtionTestCase() {
		assertEquals(20,app.sum(10,1));//for sum test case added
	}

}
