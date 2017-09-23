package com.ldu.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import org.junit.Test;

public class TestReflect {
	/*
	 * 获取Class类实例的四种方式 1. 调用类本身的.class属性 2. 通过运行时类的对象的getclass()方法获取 3.
	 * 通过Class的静态方法获取forName() 4. 通过类加载器获取
	 */
	@Test
	public void testClass() throws ClassNotFoundException {
		// 1. 调用类本身的.class属性
		Class class1 = Person.class;
		System.out.println(class1);
		System.out.println("name:"+class1.getName());
		// 2. 通过运行时类的对象的getclass()方法获取
		Person p = new Person();
		Class class2 = p.getClass();
		System.out.println(class2);
		// 3. 通过Class的静态方法获取forName()
		Class class3 = Class.forName("com.ldu.reflect.Person");
		System.out.println(class3);
		// 4. 通过类加载器获取
		ClassLoader classLoader = this.getClass().getClassLoader();
		Class class4=classLoader.loadClass("com.ldu.reflect.Person");
		System.out.println(class4);

	}

	/*
	 * @Test public void test() { Person p = new Person("张三", 21);
	 * System.out.println(p.getName() + "+" + p.getAge()); p.show();
	 * p.display("山东"); }
	 */

	@Test
	public void test1() throws Exception {
		Class<Person> clazz = Person.class;
		// 创建clazz对应的运行时Person的对象
		Person p = clazz.newInstance();
		// 通过反射调用运行时类的指定属性
		// 1. public 类型属性
		Field f1 = clazz.getField("name");
		// 为对象p的name赋值
		f1.set(p, "李四");
		System.out.println(p);
		// 2. private 类属性
		Field f2 = clazz.getDeclaredField("age");
		f2.setAccessible(true);
		f2.set(p, 13);
		System.out.println(p);

		// 通过反射调用运行时类指定的方法
		Method m1 = clazz.getMethod("show");
		m1.invoke(p);
		Method m2 = clazz.getMethod("display", String.class);
		m2.invoke(p, "山东");
		Method m3 = clazz.getMethod("testInt", int.class);
		m3.invoke(p, 33);

	}
}
