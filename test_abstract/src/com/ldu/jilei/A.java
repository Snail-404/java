package com.ldu.jilei;

import org.junit.Test;

class C {
	int a=10;
	protected void say(){
		System.out.println(a);
	}
}

public class A{
	public static void main(String[] args) {
		C aa=new C();
		aa.say();
	}
}
