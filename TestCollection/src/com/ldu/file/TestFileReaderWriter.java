package com.ldu.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.junit.Test;

public class TestFileReaderWriter {
	// 实现文本复制
	@Test
	public void test1() {
		FileReader fr = null;
		FileWriter fw = null;

		try {
			File file = new File(
					"C:\\Users\\Administrator\\Desktop\\jianli.txt");
			File file1 = new File(
					"C:\\Users\\Administrator\\Desktop\\jianli1.txt");
			fr = new FileReader(file);
			fw = new FileWriter(file1);
			char[] c = new char[24];
			int len;
			
			while ((len = fr.read(c)) != -1) {
				fw.write(c, 0, len);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				if (fr!=null) {
					fr.close();
				}
				if (fw!=null) {
					fw.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	// 读文本
	@Test
	public void test() {
		FileReader fr = null;
		try {
			File file = new File(
					"C:\\Users\\Administrator\\Desktop\\jianli.txt");
			fr = new FileReader(file);
			char[] c = new char[24];
			int len;
			while ((len = fr.read(c)) != -1) {
				String str = new String(c, 0, len);
				System.out.print(str);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (fr != null) {
				try {
					fr.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
