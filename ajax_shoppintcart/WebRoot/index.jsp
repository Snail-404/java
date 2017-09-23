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
<script type="text/javascript" src="js/jquery.blockUI.js"></script>
<script type="text/javascript">
	$(function() {
		$(document).ajaxStart($.blockUI).ajaxStop($.unblockUI);
		var judge = '${sessionScope.sc==null}';
		//alert(judge);
		//var judge1="<%=session.getAttribute("sc")%>";
		//alert("judge1:"+judge1);
		//alert(judge);
		if (judge == "true") {
			$("#shopCast").hide();
		} else {
			$("#shopCast").show();
			$("#bookName").text('${sessionScope.sc.bookName}');
			$("#bookCount").text('${sessionScope.sc.bookCount}');
			$("#totalPrice").text('${sessionScope.sc.totalPrice}');
		}
		$("a").click(function() {
			$("#shopCast").show();
			var url = this.href;
			var args = {
				"time" : new Date()
			};

			$.post(url, args, function(data) {
				//alert(data.bookName);
				$("#bookName").text(data.bookName);
				$("#bookCount").text(data.bookCount);
				$("#totalPrice").text(data.totalPrice);
			}, "json");
			return false;
		});
	});
</script>
</head>


<body>
	<div id="shopCast">
		您已将<span id="bookName"></span>加入购物车，购物车中有<span id="bookCount"></span>本书，共<span
			id="totalPrice"></span>元。
	</div>
	
	<div id="bookList">
		java<a href="addShopCart?name=java&price=100">加入购物车</a> javaScript<a
			href="addShopCart?name=javaScript&price=200">加入购物车</a> mysql<a
			href="addShopCart?name=mysql&price=300">加入购物车</a>
	</div>
</body>
</html>
