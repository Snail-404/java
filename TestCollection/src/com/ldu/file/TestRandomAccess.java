package com.ldu.file;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.RandomAccess;

import org.junit.Test;

public class TestRandomAccess {
	// 通过RandomAccessFile实现文件内容插入
	@Test
	public void test2() {
		RandomAccessFile raf=null;
		try {
			raf = new RandomAccessFile("hello2.txt", "rw");
			raf.seek(3);
			byte[] b = new byte[24];
			int len;
			StringBuffer sb = new StringBuffer();
			while ((len = raf.read(b)) != -1) {
				sb.append(new String(b, 0, len));
			}
			raf.seek(3);
			raf.write("xy".getBytes());
			raf.write(sb.toString().getBytes());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if (raf!=null) {
				try {
					raf.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	// 通过RandomAccessFile实现文件内容覆盖
	@Test
	public void test1() {
		RandomAccessFile raf = null;
		try {
			raf = new RandomAccessFile("hello2.txt", "rw");
			raf.seek(3);
			raf.write("xy".getBytes());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (raf != null) {
				try {
					raf.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

	// 测试RandomAccessFile
	@Test
	public void test() {
		RandomAccessFile raf1 = null;
		RandomAccessFile raf2 = null;
		try {
			raf1 = new RandomAccessFile("jianli1.txt", "r");
			raf2 = new RandomAccessFile("jianli2.txt", "rw");
			byte[] b = new byte[24];
			int len;
			while ((len = raf1.read(b)) != -1) {
				raf2.write(b, 0, len);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (raf1 != null) {
				try {
					raf1.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (raf2 != null) {
				try {
					raf2.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}

	}
}
