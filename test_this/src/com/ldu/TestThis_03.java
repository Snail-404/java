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
		System.out.println("��������=" + this.name);
		System.out.println("���յ�����=" + this.age);
	}

	public static void main(String[] args) {
		TestThis_03 tt = new TestThis_03("", 1); // ��㴫��ȥ�Ĳ���
		tt.print();
	}
}
