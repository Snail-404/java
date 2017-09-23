package com.ldu.thread;

public class TestDanli {
	public static void main(String[] args) {
		Singleton s1 = Singleton.getSingleton();
		Singleton s2 = Singleton.getSingleton();
		System.out.println(s1 == s2);
	}
}

class Singleton {
	private Singleton() {
	}

	private static Singleton instance = null;

	public static Singleton getSingleton() {
		if (instance == null) {
			synchronized (Singleton.class) {
				if (instance == null) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}

}