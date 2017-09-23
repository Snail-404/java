package com.ldu.reflect;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

interface Subject {
	String action();
}

class RealSubject implements Subject {

	@Override
	public String action() {
		System.out.println("���Ǵ����࣡����������������������");
		return "������";
	}
}

class AopTest{
	public void a1(){
		System.out.println("i am a1");
	}
	public void a2(){
		System.out.println("i am a2");
	}
}

class myInvocationHandler implements InvocationHandler {
	Object obj;

	public Object blind(Object obj) {
		this.obj = obj;

		// ����һ��������Ķ��󣨱�������������������������ʵ�ֵĽӿڣ����ô˷����Ķ���
		return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj
				.getClass().getInterfaces(), this);
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		AopTest at=new AopTest();
		at.a1();
		Object resultValue = method.invoke(obj, args);
		at.a2();
		return resultValue;
	}

}

public class TestDongTai {
	public static void main(String[] args) {
		RealSubject rs=new RealSubject();
		//����һ��ʵ����InvocationHandler�ӿڵ���Ķ���
		myInvocationHandler mih=new myInvocationHandler();
		Object obj=mih.blind(rs);
		Subject sub=(Subject)obj;
		String str=sub.action();
		System.out.println(str);
		System.out.println("------------------------------");
		String str1=rs.action();
		System.out.println(str1);
	}
}
