package com.ldu;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;

public class TestList {
	@Test
	public void test1(){
		List list=new ArrayList();
		list.add("aaa");
		list.add(2);
		list.add(new Date());
		System.out.println(list);
		
		list.add(1, "bbb");
		System.out.println(list);
		list.remove(1);
		System.out.println(list);
		list.set(1, "ccc");
		System.out.println(list);
		System.out.println(list.get(2));
		System.out.println(list.indexOf("ccc"));
		System.out.println(list.lastIndexOf("aaa"));
		System.out.println(list.subList(0, 3));
		System.out.println(list.contains("aaa"));
	}
}
