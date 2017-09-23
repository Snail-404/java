package com.ldu;

public class TestThis {
	    String name="Mick";
	    String age="m";
	    public void print(String name,String age){
	    	this.age=age;
	    	System.out.println("this age:"+this.age);
	    	System.out.println("age========="+age);
	        System.out.println("类中的属性 name="+this.name);
	        System.out.println("局部传参的属性="+name);
	        System.out.println("=============================");
	        this.print2();
	    }  
	    public void print2(){
	    	System.out.println("print age:"+age);
	    	System.out.println("print name:"+name);
	    }
	    public static void main(String[] args) {
	    	TestThis tt=new TestThis();
	        tt.print("Orson","f");
	       
	    }
}
