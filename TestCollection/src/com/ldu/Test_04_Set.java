package com.ldu;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;

public class Test_04_Set {
	@Test
	public void testHashSet(){
		Set set=new HashSet();
		Testss t1=new Testss(1, "aaa");
		Testss t2=new Testss(2, "vaaa");
		Testss t3=new Testss(3, "avcaa");
		Testss t4=new Testss(3, "avcaa");
		set.add(t1);
		set.add(t2);
		set.add(t3);
		set.add(t4);
		
		System.out.println(set);
	}
	
	//自然排序
	@Test
	public void testTreeSet(){
		Set set=new TreeSet();
		Employee e1=new Employee("张三", new MyDate(1,2,2000));
		Employee e2=new Employee("王五", new MyDate(1,4,1000));
		Employee e3=new Employee("李四", new MyDate(2,2,2001));
		
		set.add(e1);
		set.add(e2);
		set.add(e3);
		
		Iterator i=set.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
	}
	//定制排序
	@Test
	public void testTreeSet2(){
		Comparator com=new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				if (o1 instanceof Employee1 && o2 instanceof Employee1) {
					Employee1 e1=(Employee1)o1;
					Employee1 e2=(Employee1)o2;
					MyDate bir1=e1.getBirth();
					MyDate bir2=e2.getBirth();
					
					if (bir1.getYear()!=bir2.getYear()) {
						return bir1.getYear()-bir2.getYear();
					}else{
						if (bir1.getMonth()!=bir2.getMonth()) {
							return bir1.getMonth()-bir2.getMonth();
						}else
							return bir1.getDay()-bir2.getDay();
					}
				}
				return 0;
			}
		};
		
		Set set=new TreeSet(com);
		Employee1 e1=new Employee1("张三", new MyDate(1,2,2000));
		Employee1 e2=new Employee1("王五", new MyDate(1,4,1000));
		Employee1 e3=new Employee1("李四", new MyDate(2,2,2001));
		Employee1 e4=new Employee1("照四", new MyDate(2,3,2001));
		Employee1 e5=new Employee1("李五", new MyDate(1,2,2001));
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		set.add(e5);
		
		Iterator i=set.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
	}
	
	@Test
	public void tesst(){
		Set set=new TreeSet();
		Testss t1=new Testss(1, "aaa");
		Testss t2=new Testss(2, "vaaa");
		Testss t3=new Testss(3, "avcaa");
		set.add(t1);
		set.add(t2);
		set.add(t3);
		System.out.println(set);
	}
}
