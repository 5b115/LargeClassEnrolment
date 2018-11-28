<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
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
	<script type="text/javascript" src="/student/JQuery/jquery.gvChart-1.0.1.js">
	
	$(function(){
		
		var pageSize=${pageinfo.pageSize};
		var pageNumber=${pageinfo.pageNumber};
		alert(pageSize);
		alert(pageNumber);
	});
	
	</script>
  </head>
  
  <body>
    <input type="radio" value="2" name="pageSize"/>2
    <input type="radio" value="3" name="pageSize"/>3
    <input type="radio" value="4" name="pageSize"/>4
  </body>
</html>
