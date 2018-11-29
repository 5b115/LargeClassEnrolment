<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
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
  </head>
  
  <body>
    <table border="1">
    	<tr>
    		<td>课程号</td>
    		<td>课程名</td>
    		<td>学分</td>
    		<td>学时</td>
    		<td>考查方式</td>		
    	</tr>
    	<c:forEach items="${list}" var="course">
    		<tr>
    			<td>${course.cnumber}</td>
    			<td>${course.cname}</td>
    			<td>${course.credit}</td>
    			<td>${course.period}</td>
    			<td>${course.method}</td>		
    		</tr>
    	</c:forEach>
    	
    </table>
  </body>
</html>
