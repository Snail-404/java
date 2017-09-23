package com.ldu.file;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.junit.Test;

public class TestBuffInputStream {
	// 通过bufferreader实现复制
	// 注意bis.readline()
	@Test
	public void test1() {
		BufferedReader br=null;
		BufferedWriter bw=null;
		try {
			File src = new File("C:\\Users\\Administrator\\Desktop\\jianli.txt");
			File desc = new File("C:\\Users\\Administrator\\Desktop\\jianli4.txt");

			FileReader fr = new FileReader(src);
			FileWriter fw = new FileWriter(desc);
			br = new BufferedReader(fr);
			bw = new BufferedWriter(fw);
			
			String str;
			while((str=br.readLine())!=null){
				bw.write(str);
				bw.newLine();
				bw.flush();
			}

			/*char[] c = new char[24];
			int len;
			while ((len = br.read(c)) != -1) {
				bw.write(c, 0, len);
			}*/
		}catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	// 通过BuffInputStream实现复制
	@Test
	public void test() {
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		try {
			File src = new File("p2.jpg");
			File desc = new File("p3.jpg");

			FileInputStream fis = new FileInputStream(src);
			FileOutputStream fos = new FileOutputStream(desc);
			bis = new BufferedInputStream(fis);
			bos = new BufferedOutputStream(fos);

			byte[] b = new byte[1024];
			int len;
			while ((len = bis.read(b)) != -1) {
				bos.write(b, 0, len);
				bos.flush();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				bis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				bos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
