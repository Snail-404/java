package com.ldu.tongxin;

import java.net.InetAddress;

/*
 * InetAddress 位于java.net包下
 * InetAddress用来代表ip地址，一个InetAddress对象代表一个ip地址
 * 通过getByName() 创建InetAddress对象
 * .getHostName(): 获取ip地址对应的域名
 * .getHostAddress() : 获取ip地址
 * 
 */
public class TestInetAdress {
	public static void main(String[] args) throws Exception {
		InetAddress inet = InetAddress.getByName("www.baidu.com");
		// inet=InetAddress.getByName("61.135.169.121");
		System.out.println(inet);
		System.out.println(inet.getHostName());
		System.out.println(inet.getHostAddress());

		System.out.println("--------------------------------------");
		// 获取本机ip: getLocalHost()
		InetAddress inet1 = InetAddress.getLocalHost();
		System.out.println(inet1);
		System.out.println(inet1.getHostName());
		System.out.println(inet1.getHostAddress());
	}
}
