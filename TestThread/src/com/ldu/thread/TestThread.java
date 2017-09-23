package com.ldu.thread;

public class TestThread {
	public static void main(String[] args) {
		SubClass sc = new SubClass();
		//�������̣߳��ٵ���run()����
		//һ���߳�ֻ��ִ��һ��start()����
		System.out.println(sc.getName());
		sc.start();
		
		SubClass sc1 = new SubClass();
		sc1.start();
		for (int i = 1; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
		}
	}
}

class SubClass extends Thread {
	@Override
	public void run() {
		for (int i = 1; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
		}
	}
}