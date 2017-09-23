package com.ldu.thread;

/*
 * 1.currentThread ��ȡ��ǰ���߳�
 * 2.getName() ��ȡ�̵߳�����
 * 3.setName() �����߳�����
 * 4.yield() ���ô˷������̷߳�����ǰcpu��ִ��Ȩ
 * 5.sleep(long l)��ʾ���õ�ǰ�߳�˯��l����
 * 6.join() ��A�߳���B�̵߳��ô˷�����ʾA�߳�ִֹͣ��֪��B�߳�ִ�����
 * 7.isAlive() �жϵ�ǰ�߳��Ƿ���
 * 8.setPriority(10/5/1)���õ�ǰ�߳����ȼ�
 */
public class TestThread_01 {
	public static void main(String[] args) {
		SubClass1 sc = new SubClass1();
		sc.setName("���߳�1");
		sc.setPriority(Thread.MAX_PRIORITY);
		System.out.println(sc.getPriority());
		sc.start();
		Thread.currentThread().setName("=======���߳�");
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