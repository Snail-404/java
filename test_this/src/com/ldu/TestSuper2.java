package com.ldu;

class Tiger1 {
	int age; // 年龄
	int hight; // 身体高度

	public Tiger1(int age) {
		this.age = age;
		print();
	}

	public void print() {
		System.out.println("I'am a " + age + "岁 " + hight + "尺高 tiger!");
	}
}

public class TestSuper2 extends Tiger1 {
	public TestSuper2() {
		super(1); // 调用父类有参数的构造函数
	}

	public static void main(String[] args) {
		new TestSuper2();
	}
}
