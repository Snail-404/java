package com.ldu.thread;

public class TestBank {
	public static void main(String[] args) {
		Account acc = new Account();
		Customer c1 = new Customer(acc);
		Customer c2 = new Customer(acc);
		c1.setName("¼×·½");
		c2.setName("ÒÒ·½");
		c1.start();
		c2.start();
	}
}

class Account {
	double blance;

	public synchronized void save(double money) {
		blance += money;
		System.out.println(Thread.currentThread().getName() + ":" + blance);
	}
}

class Customer extends Thread {
	Account acc;

	public Customer(Account acc) {
		this.acc = acc;
	}

	public void run() {

		for (int i = 0; i < 3; i++) {
			acc.save(1000);
		}
	}
}