package com.ldu.reflect;


public class TestJingtai {
	public static void main(String[] args) {
		Nike nike=new Nike();
		ProxyFactory pf=new ProxyFactory(nike);
		pf.productClother();
	}
}

interface ClotherFactory{
	void productClother();
}

class ProxyFactory implements ClotherFactory{
	ClotherFactory cf;
	public ProxyFactory(ClotherFactory cf){
		this.cf=cf;
	}
	@Override
	public void productClother() {
		System.out.println("收取费用");
		cf.productClother();
	}
	
}

class Nike implements ClotherFactory{
	@Override
	public void productClother() {
		System.out.println("生产NIKE");
	}
}