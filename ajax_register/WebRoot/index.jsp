<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  	<script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
  	<script type="text/javascript" charset="utf-8">
  		$(function(){
  			$("#username").change(function(){
  				var username=$(this).val();
  				username=$.trim(username);
  				if (username!="") {
					url="registerAjaxServlet";
					var args={"username":username,"time":new Date()};
					$.post(url,args,function(data){
						$("#tips").html(data);
					});
				}
  			});
  		});
  	</script>
  	
  </head>
  
  <body>
  	<form action="">
  		username:<input type="text" name="username" id="username">
  		<div id="tips"></div>
  	</form>
  </body>
</html>
