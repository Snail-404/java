package com.ldu.file;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.junit.Test;

/*
 * getName()获取文件名
 * getPath()获取路径
 * getAbsoluteFile()获取绝对文件名（带路径）
 * getAbsolutePath()绝对路径
 * getParent() 获取上一层文件目录
 * renameTo(File name)修改文件名
 */
public class TestFile {
	@Test
	public void test() throws IOException{
		File file = new File("F:\\io\\hello.txt");
		File file1=new File("F:\\io\\io1");
		File file2 = new File("F:\\io\\hello1.txt");
		File file3 = new File("F:\\hello1.txt");
		File file4=new File("F:\\io");
		
		System.out.println(file.delete());
		System.out.println(file.createNewFile());
		System.out.println(file1.mkdir());
		
		String[] strs=file4.list();
		for (int i = 0; i < strs.length; i++) {
			System.out.println(strs[i]);
		}
		
		System.out.println("======================================");
		
		System.out.println(file.getName());
		System.out.println(file.getPath());
		System.out.println(file.getAbsoluteFile());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getParent());
		
		System.out.println("======================================");
		System.out.println(file1.getName());
		System.out.println(file1.getPath());
		System.out.println(file1.getAbsoluteFile());
		System.out.println(file1.getAbsolutePath());
		System.out.println(file1.getParent());
		System.out.println("======================================");
		boolean b=file3.renameTo(file);
		System.out.println(b);
		
		System.out.println("======================================");
		System.out.println(file.exists());
		System.out.println(file.canWrite());
		System.out.println(file.canRead());
		System.out.println(file.isFile());
		System.out.println(file.isDirectory());
		System.out.println(new Date(file.lastModified()));
		System.out.println(file.length());
		System.out.println("======================================");
		
		
	}
	
}
