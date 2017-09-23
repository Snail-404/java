package com.ldu.thread;

public class TestByInterface {
	public static void main(String[] args) {
		TestInterface ti=new TestInterface();
		Thread t1=new Thread(ti);
		Thread t2=new Thread(ti);
		t2.setName("t2=======");
		t1.start();
		t2.start();
	}
	
}

class TestInterface implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			if(i%2==0){
				System.out.println(Thread.currentThread().getName()+":"+i);
			}
		}
	}
}