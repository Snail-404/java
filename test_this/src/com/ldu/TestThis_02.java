package com.ldu;

public class TestThis_02 {
	int number;

	TestThis_02 increment() {
		number++;
		return this;
	}

	private void print() {
		System.out.println("number=" + number);
	}

	public static void main(String[] args) {
		TestThis_02 tt = new TestThis_02();
		
		System.out.println(tt.number);
		System.out.println(tt.increment());
		tt.print();
		System.out.println(tt.increment().increment());
		tt.print();
		tt.increment().increment().increment().print();
	}
}