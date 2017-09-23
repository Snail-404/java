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
	<script type="text/javascript">
		window.onload=function(){
			document.getElementById("a1").onclick=function(){
				var req=new XMLHttpRequest();
				var url=this.href;
				var method="get";
				
				req.open(method, url);
				req.send(null);
				req.onreadystatechange=function(){
					if (req.readyState==4) {
						if (req.status==200 || req.status==304) {
							var result=req.responseXML;
							var name=result.getElementsByTagName("name")[0].firstChild.nodeValue;
							var hre=result.getElementsByTagName("hre")[0].firstChild.nodeValue;
							
							alert(name);
							alert(hre);
							var aNode=document.createElement("a");
							aNode.appendChild(document.createTextNode(name));
							aNode.href=hre;
							
							var d1=document.getElementsByTagName("div")[0];
							d1.appendChild(aNode);
						}
					}
				}
				
				return false;
			}
		}
	</script>

  </head>
  
  <body>
  	<a href="../www.baidu.com">123</a>
    <a id="a1" href="file/axml.xml">testxml</a>
    <div></div>
  </body>
</html>
