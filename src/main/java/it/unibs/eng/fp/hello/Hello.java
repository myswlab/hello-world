package it.unibs.eng.fp.hello;

public class Hello {
	private final String greetings;

	public Hello(String greetings) {
		this.greetings = greetings;
	}

	public Hello() {
		this("Hello");
	}

	public String sayHello() {
		return sayHelloTo("World");
	}

	public String sayHelloTo(String to) {
		return String.format("%s, %s!", greetings, to);
	}
}
