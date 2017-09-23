package com.ldu.tongxin;

import java.net.InetAddress;

/*
 * InetAddress λ��java.net����
 * InetAddress��������ip��ַ��һ��InetAddress�������һ��ip��ַ
 * ͨ��getByName() ����InetAddress����
 * .getHostName(): ��ȡip��ַ��Ӧ������
 * .getHostAddress() : ��ȡip��ַ
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
		// ��ȡ����ip: getLocalHost()
		InetAddress inet1 = InetAddress.getLocalHost();
		System.out.println(inet1);
		System.out.println(inet1.getHostName());
		System.out.println(inet1.getHostAddress());
	}
}
