package it.unibs.eng.fp.hello;

import static org.junit.Assert.*;

import org.junit.Test;

public class HelloTest {
	@Test
	public void sayHello() throws Exception {
		assertEquals("Hello, World!", new Hello().sayHello());
	}
}
