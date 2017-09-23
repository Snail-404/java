package com.ldu.tongxin;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

import org.junit.Test;

/*
 * 客户端型服务端发送信息
 * 网络编程实际上就是socket编程
 */
public class TestTCP {
	//客户端
	@Test
	public void client() {
		Socket socket = null;
		OutputStream os = null;
		try {
			// 1.创建一个socket对象，并指明ip地址和端口号
			socket = new Socket(InetAddress.getByName("127.0.0.1"), 9010);
			// 2.获取输出流 ，发送对象
			os = socket.getOutputStream();
			// 3.具体输出过程
			os.write("我是客户端，请多关照".getBytes());
			System.out.println("455555555555555666666666666");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// 关闭相应的流及socket
			if (os != null) {
				try {
					os.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (socket != null) {
				try {
					socket.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	// 服务端
	@Test
	public void server() {
		ServerSocket ss = null;
		Socket s = null;
		InputStream is = null;
		try {
			// 1.创建一个ServerSocket对象，通过构造器指明自身端口号
			ss = new ServerSocket(9010);
			// 2.调用accept()方法，返回一个Socket对象
			s = ss.accept();
			// 3.调用getInputStream()方法，获取一个从客户端发送来的输入流
			is = s.getInputStream();
			byte[] b = new byte[24];
			int len;
			// 4.对获取的输入流进行操作
			while ((len = is.read(b)) != -1) {
				String str = new String(b, 0, len);
				System.out.println(str);
			}
			System.out.println("收到来自" + s.getInetAddress().getHostAddress()
					+ "和" + s.getInetAddress().getHostName() + "的信息");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// 关闭
			if (is != null) {
				try {
					is.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (s != null) {
				try {
					s.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (ss != null) {
				try {
					ss.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}
}
