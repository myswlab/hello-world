package it.unibs.eng.fp.hello;

import static org.junit.Assert.*;

import org.junit.Test;

public class HelloTest {
	@Test
	public void sayHello() throws Exception {
		assertEquals("Hello, World!", new Hello().sayHello());
	}

	@Test
	public void sayHelloTo() throws Exception {
		assertEquals("Hello, Pietro!", new Hello().sayHelloTo("Pietro"));
	}
	
	@Test
	public void sayHiTo() throws Exception {
		assertEquals("Hi, Pietro!", new Hello("Hi").sayHelloTo("Pietro"));
	}
}
