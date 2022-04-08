package org.stepclass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class TestHooksClass extends TestBaseClass {

	@Before
	public void thc1() {
		System.out.println("thc1");	
	}

	@Before
	public void thc() {
		System.out.println("thc2");
	}

	@Before
	public void thc3() {
		System.out.println("thc3");
	}

	@After
	public void athc1() {
		System.out.println("athc1");
	}

	@After
	public void athc2() {
		System.out.println("athc2");
	}

	@After
	public void athc3() {
		System.out.println("athc3");
	}
}
