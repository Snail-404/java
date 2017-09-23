package com.ldu.thread;

/*
 * 1.currentThread 调取当前的线程
 * 2.getName() 获取线程的名字
 * 3.setName() 设置线程名字
 * 4.yield() 调用此方法的线程放弃当前cpu的执行权
 * 5.sleep(long l)显示的让当前线程睡眠l毫秒
 * 6.join() 在A线程中B线程调用此方法表示A线程停止执行知道B线程执行完毕
 * 7.isAlive() 判断当前线程是否存活
 * 8.setPriority(10/5/1)设置当前线程优先级
 */
public class TestThread_01 {
	public static void main(String[] args) {
		SubClass1 sc = new SubClass1();
		sc.setName("子线程1");
		sc.setPriority(Thread.MAX_PRIORITY);
		System.out.println(sc.getPriority());
		sc.start();
		Thread.currentThread().setName("=======主线程");
		for (int i = 1; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
			/*if (i%100==0) {
				Thread.currentThread().yield();
			}*/
			/*if (i==20) {
				try {
					sc.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}*/
		}
		System.out.println(sc.isAlive());
	}
}

class SubClass1 extends Thread {
	@Override
	public void run() {
		
		for (int i = 1; i < 100; i++) {
			/*try {
				Thread.currentThread().sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
			System.out.println(Thread.currentThread().getName() + ":" + i);
		}
	}
}