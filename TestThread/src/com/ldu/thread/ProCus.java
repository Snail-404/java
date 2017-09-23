package com.ldu.thread;

public class ProCus {
	
	public static void main(String[] args) {
		Clerk c=new Clerk();
		Product p1=new Product(c);
		Customers c1=new Customers(c);
		
		Thread tp1=new Thread(p1);
		Thread tp2=new Thread(p1);
		Thread tc1=new Thread(c1);
		
		tp1.setName("������1");
		tp2.setName("������2");
		tc1.setName("������1");
		
		tp1.start();
		tp2.start();
		tc1.start();
	}
}

class Clerk{
	int product;
	
	public synchronized void addProducts(){
		if (product>=20) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else{
			product++;
			System.out.println(Thread.currentThread().getName()+"�����˵�"+product+"����Ʒ");
			notify();
			//notifyAll();
		}
	}
	
	public synchronized void delProducts(){
		if (product<1) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else{
			System.out.println(Thread.currentThread().getName()+"�����˵�"+product+"����Ʒ");
			product--;
			notify();
			//notifyAll();
		}
	}
}

class Customers implements Runnable{
	Clerk c;
	public Customers(Clerk c){
		this.c=c;
	}
	@Override
	public void run() {
		while(true){
			try {
				Thread.currentThread().sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			c.delProducts();
		}
	}
	
}

class Product implements Runnable{
	Clerk c;
	public Product(Clerk c){
		this.c=c;
	}
	
	@Override
	public void run() {
		while(true){
			try {
				Thread.currentThread().sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			c.addProducts();
		}
	}
}