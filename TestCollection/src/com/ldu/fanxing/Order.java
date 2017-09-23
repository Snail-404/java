package com.ldu.fanxing;

import java.util.ArrayList;
import java.util.List;

public class Order<T> {
	private String name;
	private T t;
	private List<T> list=new ArrayList<T>();
	
	public <E> List<E> getE(E[] e,List<E> list2){
		for(E ee: e){
			list2.add(ee);
		}
		return list2;
	}
	
	public void add(T tt){
		list.add(tt);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}
	@Override
	public String toString() {
		return "Order [name=" + name + ", t=" + t + "]";
	}
	public List<T> getList() {
		return list;
	}
	public void setList(List<T> list) {
		this.list = list;
	}
}
