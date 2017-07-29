package com.stackroute.ci.continuosintegration;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class SumTestCases {

	private static App app;
	
	@BeforeClass
	public static void init() throws Exception {
		
		app = new App();
	}
	
	@Test
	public void AddtionTestCase() {
		assertEquals(20,app.sum(10, 5));//for sum test cases
	}

}
