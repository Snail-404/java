package com.ldu;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class Test_05_List {
	@Test
	public void testList(){
		List list=new ArrayList();
		list.add("ddd");
		list.add("ss");
		list.add("dfkjk");
		list.add(3);
		list.add(1,2);
		
		System.out.println(list.get(4));
		list.remove(1);
		System.out.println(list);
	}
}
