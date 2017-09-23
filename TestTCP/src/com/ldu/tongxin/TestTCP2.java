package com.ldu.tongxin;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

import org.junit.Test;

public class TestTCP2 {
	@Test
	public void client(){
		Socket socket=null;
		OutputStream os=null;
		FileInputStream fis=null;
		InputStream is=null;
		try {
			socket = new Socket(InetAddress.getByName("127.0.0.1"), 9012);
			os = socket.getOutputStream();
			fis = new FileInputStream("p2.jpg");
			byte[] b=new byte[20];
			int len;
			while((len=fis.read(b))!=-1){
				os.write(b, 0, len);
			}
			socket.shutdownOutput();
			
			is = socket.getInputStream();
			byte[] b1=new byte[20];
			int len1;
			while((len1=is.read(b1))!=-1){
				String str=new String(b1,0,len1);
				System.out.println(str);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				is.close();
				os.close();
				fis.close();
				socket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	@Test
	public void server(){
		ServerSocket ss=null;
		Socket socket=null;
		InputStream is=null;
		FileOutputStream fos=null;
		OutputStream os=null;
		try {
			ss = new ServerSocket(9012);
			socket = ss.accept();
			is = socket.getInputStream();
			fos = new FileOutputStream("liu.jpg");
			byte[] b=new byte[20];
			int len;
			while((len=is.read(b))!=-1){
				fos.write(b, 0, len);
			}
			System.out.println("已接收到来自"+socket.getInetAddress().getHostAddress()+"的信息");
			os = socket.getOutputStream();
			os.write("我一接收到图片".getBytes());
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				os.close();
				fos.close();
				is.close();
				socket.close();
				ss.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
}
