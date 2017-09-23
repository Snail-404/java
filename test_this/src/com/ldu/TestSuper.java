package com.ldu;

class Tiger {
	private int age; // 年龄
	private int hight; // 身体高度

	/*public Tiger() {
		System.out.println("22222222222");
		print();
	}*/

	public Tiger(int age, int height) {
		this.age = age;
		this.hight = height;
		print();
	}

	public void print() {
		System.out.println("I'am a " + age + "岁 " + hight + "尺高 tiger!");
	}
}


public class TestSuper extends Tiger {
	private String name;
	//public TestSuper(){}
	public TestSuper(int age, int height, String name) {
		super(age, height); // 调用父类无参数的构造函数
		this.name = name;
	}

	public static void main(String[] args) {
		TestSuper ts = new TestSuper(1, 2, "sss");
		System.out.println("name=========" + ts.name);

	}
}