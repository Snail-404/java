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
 * �ͻ����ͷ���˷�����Ϣ
 * ������ʵ���Ͼ���socket���
 */
public class TestTCP {
	//�ͻ���
	@Test
	public void client() {
		Socket socket = null;
		OutputStream os = null;
		try {
			// 1.����һ��socket���󣬲�ָ��ip��ַ�Ͷ˿ں�
			socket = new Socket(InetAddress.getByName("127.0.0.1"), 9010);
			// 2.��ȡ����� �����Ͷ���
			os = socket.getOutputStream();
			// 3.�����������
			os.write("���ǿͻ��ˣ�������".getBytes());
			System.out.println("455555555555555666666666666");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// �ر���Ӧ������socket
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

	// �����
	@Test
	public void server() {
		ServerSocket ss = null;
		Socket s = null;
		InputStream is = null;
		try {
			// 1.����һ��ServerSocket����ͨ��������ָ������˿ں�
			ss = new ServerSocket(9010);
			// 2.����accept()����������һ��Socket����
			s = ss.accept();
			// 3.����getInputStream()��������ȡһ���ӿͻ��˷�������������
			is = s.getInputStream();
			byte[] b = new byte[24];
			int len;
			// 4.�Ի�ȡ�����������в���
			while ((len = is.read(b)) != -1) {
				String str = new String(b, 0, len);
				System.out.println(str);
			}
			System.out.println("�յ�����" + s.getInetAddress().getHostAddress()
					+ "��" + s.getInetAddress().getHostName() + "����Ϣ");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// �ر�
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
