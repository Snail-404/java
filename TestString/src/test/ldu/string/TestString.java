package test.ldu.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class TestString {
	
	@Test
	public void test2(){
	}
	@Test
	public void test1(){
		String s="3";
		int n=Integer.parseInt(s);
		System.out.println(n);
		String str="123";
		int num=Integer.parseInt(str);
		System.out.println(num);
		String str2=num+"";
		System.out.println(str2);
		System.out.println(str2 instanceof String);
		String str3=String.valueOf(num);
		System.out.println(str3);
		System.out.println(str3 instanceof String);
		
		Integer m=3;
		String mm=m.toString();
		System.out.println(mm);
		System.out.println(mm instanceof Object);
		
		String st="ÖÐ¹ú";
		char[] c=st.toCharArray();
		System.out.println(c);
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
		
		String st1=new String(c);
		System.out.println(st1);
		String st2=String.valueOf(c);
		System.out.println(st2 instanceof String);
		
		Integer i=3;
		System.out.println(i instanceof Integer);
	}
	
	@Test
	public void test(){
		
		
		String str="dabcdefghiad";
		String str1="de";
		System.out.println(str.charAt(5));
		System.out.println(str.indexOf(str1));
		
		System.out.println(str.substring(2, 4));
		System.out.println(str+"---------------");
		System.out.println(str.replace("a","x"));
		System.out.println(str+"---------------");

		
		System.out.println(str.concat(str1));
		System.out.println(str+"---------------");
		String[] str2=str.split("[a,e]");
		for (int i = 0; i < str2.length; i++) {
			System.out.println(str2[i]);
		}
		
		
		System.out.println("================================");
		/*char[] c={'a','b','c','d'};
		byte[] b={'a','b','c','d','e'};
		String str =new String(c,0,2);
		
		String str1 =new String(b,0,3);
		System.out.println(str1);*/
		
		/*str=String.valueOf(c);
		System.out.println(str);*/
		
		
		
		/*c=str.toCharArray();
		System.out.println(c);
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}*/
	}
	@Test
	public void testString(){
		StringBuffer sb=new StringBuffer();
		String bookName="zhhhhhhhhh";
		String kk="kjljljklj";
		int p=3;
		sb.append("{")
		.append("'bookName':'"+bookName+"'")
		.append(",")
		.append("'bookCount':"+p)
		.append(",")
		.append("'totalPrice':"+p)
		.append("}");
		System.out.println(sb);
		System.out.println(sb.toString());
	}
}
