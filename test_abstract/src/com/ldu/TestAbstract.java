package com.ldu;

abstract class Person {
	protected String name = null;

	public Person(String name) {
		this.name = name;
	}

	public void say(){
		System.out.println("this is person class");
	}
	
	public abstract void eat();

	public abstract void sleep();
}

class Student extends Person {
	public Student(String name) {
		super(name);
	}

	public void say(){
		System.out.println("this is student class");
	}
	
	public void test(){
		System.out.println("ssssssssssssssss");
	}
	
	@Override
	public void eat() {
		System.out.println("ѧ��" + name + "���ڳԷ�......");
	}

	@Override
	public void sleep() {
		System.out.println("ѧ��" + name + "���ڳԷ�......");
	}
}

public class TestAbstract {
	public static void main(String[] args) {
		Person p = new Student("������");
		p.eat();
		p.sleep();
		p.say();
		
	}
}
