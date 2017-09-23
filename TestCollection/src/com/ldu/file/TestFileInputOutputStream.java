package com.ldu.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.junit.Test;

public class TestFileInputOutputStream {
	
	@Test
	public void test4(){
		String desc="C:\\Users\\Administrator\\Desktop\\sxt.rar";
		String src="C:\\Users\\Administrator\\Desktop\\图片\\sxt.rar";
		long start=System.currentTimeMillis();
		copy(desc, src);
		long end=System.currentTimeMillis();
		System.out.println("所需时间："+(end-start));
	}
	
	// 封装方法
	public void copy(String desc, String src) {
		File file1 = new File(desc);
		File file2 = new File(src);
		FileInputStream fis = null;
		FileOutputStream fos = null;

		try {
			fis = new FileInputStream(file1);
			fos = new FileOutputStream(file2);

			byte[] b = new byte[20];
			int len;
			while ((len = fis.read(b)) != -1) {
				fos.write(b, 0, len);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	// 文件从磁盘到项目
	@Test
	public void test3() {
		File file1 = new File("C:\\Users\\Administrator\\Desktop\\图片\\p2.jpg");
		File file2 = new File("F:\\p2.jpg");
		FileInputStream fis = null;
		FileOutputStream fos = null;

		try {
			fis = new FileInputStream("C:\\Users\\Administrator\\Desktop\\图片\\p2.jpg");
			fos = new FileOutputStream("F:\\p2.jpg");

			byte[] b = new byte[20];
			int len;
			while ((len = fis.read(b)) != -1) {
				fos.write(b, 0, len);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	// 写出文件
	@Test
	public void test2() {
		File file = new File("hello2.txt");
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(file);
			fos.write(new String("hello fileoutstream").getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

	// 读取文件2
	@Test
	public void test1() {
		//File file = new File("F:\\io\\hello.txt");
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("F:\\io\\hello.txt");
			byte[] b = new byte[5];
			int len;
			while ((len = fis.read(b)) != -1) {
				/*
				 * for (int i = 0; i < len; i++) { System.out.print((char)b[i]);
				 * }
				 */
				String str = new String(b, 0, len);
				System.out.println(str);
			}
			System.out.println(len);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

	// 读取文件
	@Test
	public void test() {
		File file = new File("F:\\io\\hello.txt");
		System.out.println(file.exists());
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
			int b;
			while ((b = fis.read()) != -1) {
				System.out.println((char) b);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
