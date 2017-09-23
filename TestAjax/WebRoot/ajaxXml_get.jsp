<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'ajaxXml.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
 	<script type="text/javascript" src="js/jquery-3.2.1.min.js"></script></head>
  
	<script type="text/javascript">
		$(function(){
			$("#a1").click(function(){
				var url=this.href;
				var args={"time":new Date()};
				$.get(url,args,function(data){
					var name=$(data).find("name").text();
					var hre=$(data).find("hre").text();
					alert("success");
					$("#d1").empty().append("<a href='"+hre+"'>"+name+"</a>");
					
				});
				return false;
			});
		});
	</script>
  <body>
  	
  	<a href="../www.baidu.com">123</a>
    <a id="a1" href="file/axml.xml">testxml</a>
    <div id="d1"></div>
  </body>
</html>
