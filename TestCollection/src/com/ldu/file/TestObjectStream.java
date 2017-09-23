package com.ldu.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import org.junit.Test;

public class TestObjectStream {
	//ʵ�ֶ������л�
	@Test
	public void test1(){
		ObjectInputStream ois=null;
		try {
			FileInputStream fis=new FileInputStream("obj.txt");
			ois = new ObjectInputStream(fis);
			Person p1=(Person) ois.readObject();
			System.out.println(p1);
			Person p2=(Person) ois.readObject();
			System.out.println(p2);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if (ois!=null) {
				try {
					ois.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
		
		
	}
	//ʵ�ֶ������л�
	@Test
	public void test() {
		ObjectOutputStream oos = null;
		try {
			FileOutputStream fos = new FileOutputStream("obj.txt");
			oos = new ObjectOutputStream(fos);
			Person p1 = new Person("��Ϊ", 3000);
			Person p2 = new Person("��ҫ", 2500);

			oos.writeObject(p1);
			oos.flush();
			oos.writeObject(p2);
			oos.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				oos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Person implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

}