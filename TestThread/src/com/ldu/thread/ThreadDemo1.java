package com.ldu.thread;

class ThreadDemo1// ��ʾ�����̵߳ķ���һ�̳�Thread��
{
	public static void main(String[] args) {
		MyThread1 m1 = new MyThread1();
		MyThread1 m2 = new MyThread1();
		MyThread1 m3 = new MyThread1();
		m1.start();
		m2.start();
		m3.start();
	}
}

class MyThread1 extends Thread {
	private static int num = 100;

	public void run() {
		while (num > 0) {
			System.out.println("�����߳�: " + Thread.currentThread().getName()
					+ "num: " + num--);
		}
	}
}