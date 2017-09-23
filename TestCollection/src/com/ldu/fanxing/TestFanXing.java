package com.ldu.fanxing;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class TestFanXing {
	@Test
	public void test1(){
		Order<Integer> o=new Order<Integer>();
		o.setT(33);
		int oo=o.getT();
		System.out.println(oo);
		o.add(333);
		System.out.println(o.getList());
		Integer[] in=new Integer[]{1,2,3};
		List<Integer> list1=new ArrayList<Integer>();
		List<Integer> list2;
		list2=o.getE(in, list1);
		System.out.println(list2);
	}
}
