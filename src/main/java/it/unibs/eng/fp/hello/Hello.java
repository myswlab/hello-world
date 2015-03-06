package it.unibs.eng.fp.hello;

public class Hello {

	public String sayHello() {
		return sayHelloTo("World");
	}

	public String sayHelloTo(String to) {
		return String.format("Hello, %s!", to);
	}
}
