<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
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
<script type="text/javascript" charset="utf-8">
	$(function(){
		$("#a1").click(function(){
			var url=this.href;
			var args={"time":new Date()};
			$.post(url,args,function(data){
				var name=data.taga.name;
				var hre=data.taga.hre;
				alert("json success post");
				$("div").empty().append("<a href='"+hre+"'>"+name+"</a>");
				
			},"json");
			return false;
		});
	});
</script>


<body>
	<a href="../www.baidu.com">123</a>
	<a id="a1" href="file/json.txt">testjson</a>
	<div></div>
</body>
</html>
