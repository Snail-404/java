package com.ldu;

public class TestThis_03 {
	String name;
	int age;

	public TestThis_03() {} 
	public TestThis_03(int age) {
		this.age = age;
	}

	public TestThis_03(String name, int age) {
		this(age);
		this.name = "Mick";
	}

	private void print() {
		System.out.println("最终名字=" + this.name);
		System.out.println("最终的年龄=" + this.age);
	}

	public static void main(String[] args) {
		TestThis_03 tt = new TestThis_03("", 1); // 随便传进去的参数
		tt.print();
	}
}
