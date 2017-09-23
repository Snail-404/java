<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>test ajax</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type="text/javascript">
		window.onload=function(){
				document.getElementById('a1').onclick=function(){
					//console.log("dddddddddd");
					var request=new XMLHttpRequest();
					var url=this.href+"?time="+new Date();
					var method="get";
					request.open(method,url);
					request.send(null);
					request.onreadystatechange=function(){
						if (request.readyState==4) {
							if (request.status==200 || request.status==304) {
								alert(request.responseText);
							}
						}
					}
					return false;	
				}
			}
	</script>
  </head>
  
  <body>
    <a id="a1" href="file/hel.txt">hello</a>
    <a href="#">ss</a>
  </body>
</html>
