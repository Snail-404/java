package com.ldu.reflect;

public class Person {
	public String name;
	private int age;
	

	public Person() {
		super();
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	public void show() {
		System.out.println("我是一个人类");
	}

	public void display(String address) {
		System.out.println("我来自" + address);
	}
	
	public void testInt(int x){
		System.out.println(x);
	}
}
