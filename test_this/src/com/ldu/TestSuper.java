package com.ldu;

class Tiger {
	private int age; // ����
	private int hight; // ����߶�

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
		System.out.println("I'am a " + age + "�� " + hight + "�߸� tiger!");
	}
}


public class TestSuper extends Tiger {
	private String name;
	//public TestSuper(){}
	public TestSuper(int age, int height, String name) {
		super(age, height); // ���ø����޲����Ĺ��캯��
		this.name = name;
	}

	public static void main(String[] args) {
		TestSuper ts = new TestSuper(1, 2, "sss");
		System.out.println("name=========" + ts.name);

	}
}