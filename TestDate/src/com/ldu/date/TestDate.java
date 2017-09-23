package com.ldu.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class TestDate {
	@Test
	public void test2(){
		Calendar c=Calendar.getInstance();
		int day=c.get(Calendar.DAY_OF_MONTH);
		System.out.println(day);
		
		Date d=c.getTime();
		System.out.println(d);
		
	}
	
	@Test
	public void test1() throws ParseException{
		String s1="2017-09-09 22";
		String s2="2017-09-05 21";
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh");
		Date d1=sdf.parse(s1);
		Date d2=sdf.parse(s2);
		
		Date date=new Date(d1.getTime());
		System.out.println(date);
		
		long time=d1.getTime()-d2.getTime();
		int days;
		days=(int) (time/1000/3600/24+1);
		System.out.println(days);
	}
	@Test
	public void test() throws ParseException{
		Date d=new Date();
		System.out.println(d);
		System.out.println(d.toString());
		
		SimpleDateFormat sdf=new SimpleDateFormat();
		System.out.println(sdf);
		System.out.println(sdf.format(new Date()));
		
		SimpleDateFormat sdf1=new SimpleDateFormat("yy-MM-dd hh:mm:ss");
		String d1=sdf1.format(new Date());
		System.out.println(d1);
		
		Date date=sdf1.parse("17-09-09 10:01:17");
		System.out.println(date);
	}
}
