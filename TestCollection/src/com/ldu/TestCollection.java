package com.ldu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

public class TestCollection {
	@Test
	public void test() {
		List list = new ArrayList();
		System.out.println(list.size());
		list.add(1);
		list.add("ttt");
		list.add(new Date());
		System.out.println(list.size());

		List list1 = new ArrayList();
		list1.add(1);
		list1.add("ttt");
		list1.add(new Date());
		list.addAll(list1);// 添加collection类型的集合
		System.out.println(list.size());
		System.out.println(list.isEmpty());// 判断是否为空
		list.clear();
		System.out.println(list.isEmpty());

	}

	@Test
	public void test1() {
		List list = new ArrayList();
		list.add("1");
		list.add("ttt");
		list.add(new Date());

		// 6判断是否包含某个元素
		// Person p1=new Person("p1", 11);
		list.add(new Person("p1", 11));
		boolean b1 = list.contains(new Person("p1", 11));
		System.out.println(b1);
		System.out.println(list);
		
		// 7containsAll判断当前集合是否包含该集合的内容
		List list1 = new ArrayList();
		list1.add("1");
		list1.add("ttt");
		boolean b2=list.containsAll(list1);
		System.out.println(b2);
		//8取交集retainall
		//list.retainAll(list1);
		System.out.println(list);
		boolean b3=list.remove("1");
		System.out.println(b3);
		System.out.println(list);
		//9 removeAll 删除list中list1的元素
		//10 eauals 判断两个集合是否完全相同
		
	}
	@Test
	public void test2(){
		//11 toarray 转换为数数组
		List list = new ArrayList();
		list.add("1");
		list.add("ttt");
		list.add(new Date());
		Object[] obj=list.toArray();
		for (int i = 0; i < obj.length; i++) {
			System.out.println(obj[i]);
		}
		System.out.println("==========================");
		//12 iterator 遍历
		Iterator iterator=list.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		System.out.println("==========================");
		
		for (int i = 0; i < list.size(); i++) {
			
		}
	}

}
