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
    
    <title>My JSP 'selall_student.jsp' starting page</title>
    
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
    			<td>学号</td>
    			<td>姓名</td>
    			<td>性别</td>
    			<td>学院</td>
    			<td>年级</td>
    			<td>身份证号</td>
    			<td>出生日期</td>
    			<td>民族</td>		
    		</tr>
    		<c:forEach items="${list }" var="student">
    			<tr>
    				<td>${student.snumber }</td>
    				<td>${student.sname }</td>
    				<td>${student.ssex }</td>
    				<td>${student.sacademe }</td>
    				<td>${student.syear }</td>
    				<td>${student.sid}</td>
    				<td>${student.sbirthday }</td>
    				<td>${student.snation }</td> 
    			</tr>  			
    		</c:forEach>
    	</table>
  </body>
</html>
