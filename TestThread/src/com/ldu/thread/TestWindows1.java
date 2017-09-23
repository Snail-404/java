package com.ldu.thread;

public class TestWindows1 {
	public static void main(String[] args) {
		Window1 win = new Window1();
		Thread t1 = new Thread(win);
		Thread t2 = new Thread(win);
		Thread t3 = new Thread(win);

		t1.setName("����1");
		t2.setName("����2");
		t3.setName("����3");

		t1.start();
		t2.start();
		t3.start();
	}
}

class Window1 implements Runnable {
	int ticket = 100;

	// Object obj = new Object();

	// ͬ������
	/*
	 * @Override public void run() { while(true){ show(); if (ticket<=0) {
	 * break; } }
	 * System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"); }
	 * 
	 * public synchronized void show(){ if (ticket > 0) {
	 * System.out.println(Thread.currentThread().getName() + "��Ʊ��" + ticket--);
	 * } }
	 */

	// ͬ��������
	@Override
	public void run() {
		while (true) {
			synchronized (this) {
				if (ticket > 0) {
					System.out.println(Thread.currentThread().getName() + "��Ʊ��"
							+ ticket--);
				} else
					break;
			}
		}
	}
}