package edu.esprit.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import edu.esprit.demo.Greeter;

public class GreeterTest {
	
	Greeter greeter;

	@Before
	public void setUp() throws Exception {
		
		greeter = new Greeter();
	}

	@Test
	public void test() {
		
		assertEquals("Hello Salah", greeter.sayHello("Salah"));
		
	}

}
