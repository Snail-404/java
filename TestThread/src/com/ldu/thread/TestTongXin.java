package com.ldu.thread;

public class TestTongXin {
	public static void main(String[] args) {
		PrintNum p1 = new PrintNum();
		Thread t1 = new Thread(p1);
		Thread t2 = new Thread(p1);

		t1.setName("¼×");
		t2.setName("Ò»");

		t1.start();
		t2.start();
	}
}

class PrintNum implements Runnable {
	private int num = 1;

	@Override
	public void run() {
		while (true) {
			synchronized (this) {
				notify();
				if (num <= 100) {
					System.out.println(Thread.currentThread().getName() + ":"
							+ num++);
				} else
					break;
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
