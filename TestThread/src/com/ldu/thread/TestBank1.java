package com.ldu.thread;

public class TestBank1 {
	public static void main(String[] args) {
		Customer1 c = new Customer1();
		Thread t1=new Thread(c);
		Thread t2=new Thread(c);
		t1.setName("¼×·½==");
		t2.setName("ÒÒ·½==");
		t1.start();
		t2.start();
	}
}

class Account1 {
	double blance;

	public synchronized void save(double money) {
		notify();
		blance += money;
		System.out.println(Thread.currentThread().getName() + ":" + blance);
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class Customer1 implements Runnable{
	Account1 acc=new Account1();
	
	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			acc.save(1000);
		}
	}
	
}