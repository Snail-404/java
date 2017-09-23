package com.ldu.thread;

public class TestWindows {
	
	public static void main(String[] args) {
		Window w1=new Window();
		Window w2=new Window();
		Window w3=new Window();
		
		w1.setName("´°¿Ú1");
		w2.setName("´°¿Ú2");
		w3.setName("´°¿Ú3");
		
		w1.start();
		w2.start();
		w3.start();
	}
}

class Window extends Thread{
	static int ticket=30;
	static Object obj=new Object();
	@Override
	public void run() {
		while(true){
			synchronized (obj) {
				if (ticket>0) {
					System.out.println(Thread.currentThread().getName()+"Æ±ºÅ£º"+ticket--);
				}else
					break;
			}
			
		}
	}
}