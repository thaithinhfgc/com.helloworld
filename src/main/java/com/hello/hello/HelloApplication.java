package com.hello.hello;

public class HelloApplication {

	public static void main(String[] args) {
		INterface mess = new printHelloWorld();
		INterface mess2 = new printHelloYou();
		System.out.println(mess.getString());
		System.out.println(mess2.getString());

	}

}
