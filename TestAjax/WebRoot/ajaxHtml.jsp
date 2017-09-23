<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>trans html</title>
    
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
			document.getElementById("a1").onclick=function(){
				var req=new XMLHttpRequest();
				var method="get";
				var url=this.href;
				
				req.open(method, url);
				req.send(null);
				
				req.onreadystatechange=function(){
					if (req.readyState==4) {
						if (req.status==200 || req.status==304) {
							document.getElementById("d1").innerHTML=req.responseText;
						}
					}
				}
				return false;
			}
		}
	</script>

  </head>
  
  <body>
    <a id="a1" href="file/test.html">html</a>
    
    <div id="d1"></div>
  </body>
</html>
