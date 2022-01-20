package com.in28minutes.collections;

public class Person implements Comparable<Person> {
	String name;
	int age;

	public Person() {

	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Name is: " + name + " and Age is :" + age;
	}

	@Override
	public int compareTo(Person p) {
		return this.name.compareTo(p.name);
	}

}
