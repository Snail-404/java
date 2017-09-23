package com.ldu.file;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

import org.junit.Test;

public class TestInputStreamReader {
	@Test
	public void test(){
		BufferedReader br=null;
		BufferedWriter bw=null;
		try {
			File file=new File("C:\\Users\\Administrator\\Desktop\\jianli.txt");
			File file1=new File("jianli1.txt");
			
			//½âÂë£º ×Ö½ÚÊý×é--->×Ö·û´®
			FileInputStream fis=new FileInputStream(file);
			InputStreamReader isr=new InputStreamReader(fis,"GBK");
			br=new BufferedReader(isr);
			
			//±àÂë£º ×Ö·û´®--->×Ö½ÚÊý×é
			FileOutputStream fos=new FileOutputStream(file1);
			OutputStreamWriter osw=new OutputStreamWriter(fos,"GBK");
			bw=new BufferedWriter(osw);
			String str;
			while((str=br.readLine())!=null){
				bw.write(str);
				bw.newLine();
				bw.flush();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				br.close();
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
