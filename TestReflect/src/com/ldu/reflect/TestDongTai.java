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
		System.out.println("我是代理类！！！！！！！！！！！！");
		return "代理类";
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

		// 返回一个代理类的对象（被代理类的类加载器，被代理类实现的接口，调用此方法的对象）
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
		//创建一个实现了InvocationHandler接口的类的对象
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
