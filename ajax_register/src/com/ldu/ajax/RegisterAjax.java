 package com.ldu.ajax;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterAjax extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public RegisterAjax() {
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
		doPost(request,response);
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String username=request.getParameter("username");
		List<String> nameList=new ArrayList<String>();
		nameList.add("aaa");
		nameList.add("bbb");
		String result=null;
		if (nameList.contains(username)) {
			result="<font color='red'>该用户名已被使用</font>";
		}else{
			result="<font color='blue'>该用户名可以使用</font>";
		}
		response.setContentType("text/html;charset=utf-8");
		response.setCharacterEncoding("utf-8");
		response.getWriter().print(result);
	}

	public void init() throws ServletException {
		// Put your code here
	}

}
