package com.ldu;

class Tiger1 {
	int age; // ����
	int hight; // ����߶�

	public Tiger1(int age) {
		this.age = age;
		print();
	}

	public void print() {
		System.out.println("I'am a " + age + "�� " + hight + "�߸� tiger!");
	}
}

public class TestSuper2 extends Tiger1 {
	public TestSuper2() {
		super(1); // ���ø����в����Ĺ��캯��
	}

	public static void main(String[] args) {
		new TestSuper2();
	}
}
