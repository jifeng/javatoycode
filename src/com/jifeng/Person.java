package com.jifeng;

public class Person {
	String name;
	int age;
	public Person (String name) {
		this.name = name;
		System.out.println("Person is " + name);
	}

	public void changeName (String name) {
		this.name = name;
		return;
	}
	
	public String printName () {
		System.out.println("Person is " + name);
		return this.name;
	}
}
