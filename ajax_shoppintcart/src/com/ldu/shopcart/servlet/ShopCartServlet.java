package com.ldu.shopcart.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ldu.Service.ShoppintCartService;

public class ShopCartServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public ShopCartServlet() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//��ȡ�ͻ��˴����Ĳ���
		String bookName=request.getParameter("name");
		int price=Integer.parseInt(request.getParameter("price"));
		
		//���ж�session���Ƿ����й��ﳵ����û�����½�һ������������ʹ�����еĹ��ﳵ
		HttpSession session=request.getSession();
		ShoppintCartService sc=(ShoppintCartService) session.getAttribute("sc");
		if (sc==null) {
			sc=new ShoppintCartService();
			session.setAttribute("sc", sc);
		}
		System.out.println(sc.getItems());
		//��ѡ�����Ʒ���빺�ﳵ��
		sc.addToCart(bookName, price);
		System.out.println(sc.getBookCount());
		//׼����Ӧ������(json)
		/*StringBuffer sb=new StringBuffer();
		sb.append("{")
			.append("\"bookName\":\""+bookName+"\"")
			.append(",")
			.append("\"bookCount\":"+sc.getBookCount())
			.append(",")
			.append("\"totalPrice\":"+sc.getTotalPrice())
			.append("}");
		System.out.println(sb.toString());	*/
		
		ObjectMapper mapper=new ObjectMapper();
		String result=mapper.writeValueAsString(sc);
		System.out.println("--------"+result);
		
		//��Ӧjson����
		response.setContentType("text/javascript;charset=utf-8");
		response.setCharacterEncoding("utf-8");
		//response.getWriter().print(sb.toString());
		response.getWriter().print(result);
		
	}

	
	public void init() throws ServletException {
		// Put your code here
	}

}
