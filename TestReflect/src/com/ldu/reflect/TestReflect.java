package com.ldu.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import org.junit.Test;

public class TestReflect {
	/*
	 * ��ȡClass��ʵ�������ַ�ʽ 1. �����౾���.class���� 2. ͨ������ʱ��Ķ����getclass()������ȡ 3.
	 * ͨ��Class�ľ�̬������ȡforName() 4. ͨ�����������ȡ
	 */
	@Test
	public void testClass() throws ClassNotFoundException {
		// 1. �����౾���.class����
		Class class1 = Person.class;
		System.out.println(class1);
		System.out.println("name:"+class1.getName());
		// 2. ͨ������ʱ��Ķ����getclass()������ȡ
		Person p = new Person();
		Class class2 = p.getClass();
		System.out.println(class2);
		// 3. ͨ��Class�ľ�̬������ȡforName()
		Class class3 = Class.forName("com.ldu.reflect.Person");
		System.out.println(class3);
		// 4. ͨ�����������ȡ
		ClassLoader classLoader = this.getClass().getClassLoader();
		Class class4=classLoader.loadClass("com.ldu.reflect.Person");
		System.out.println(class4);

	}

	/*
	 * @Test public void test() { Person p = new Person("����", 21);
	 * System.out.println(p.getName() + "+" + p.getAge()); p.show();
	 * p.display("ɽ��"); }
	 */

	@Test
	public void test1() throws Exception {
		Class<Person> clazz = Person.class;
		// ����clazz��Ӧ������ʱPerson�Ķ���
		Person p = clazz.newInstance();
		// ͨ�������������ʱ���ָ������
		// 1. public ��������
		Field f1 = clazz.getField("name");
		// Ϊ����p��name��ֵ
		f1.set(p, "����");
		System.out.println(p);
		// 2. private ������
		Field f2 = clazz.getDeclaredField("age");
		f2.setAccessible(true);
		f2.set(p, 13);
		System.out.println(p);

		// ͨ�������������ʱ��ָ���ķ���
		Method m1 = clazz.getMethod("show");
		m1.invoke(p);
		Method m2 = clazz.getMethod("display", String.class);
		m2.invoke(p, "ɽ��");
		Method m3 = clazz.getMethod("testInt", int.class);
		m3.invoke(p, 33);

	}
}
