<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
<head>
<base href="<%=basePath%>">
	<meta charset="UTF-8">
	<title>Basic ValidateBox - jQuery EasyUI Demo</title>
	<link rel="stylesheet" type="text/css" href="themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="themes/icon.css">
	<link rel="stylesheet" type="text/css" href="css/demo.css">
	<script type="text/javascript" src="js/jquery.min.js"></script>
	<script type="text/javascript" src="js/jquery.easyui.min.js"></script>
</head>
<body>
	<div style="margin:20px 0;"></div>
	<div class="easyui-panel" title="新增管理人员" style="width:400px;padding:10px 60px 20px 60px">
		<form action="insertuser">
			<table cellpadding="4">

			<tr>
				<td>工号:</td>
				<td><input name="mnumber" class="easyui-validatebox textbox" data-options="required:true,validType:'length[5,20]'"></td>
			</tr>
			
			<tr>
				<td>姓名:</td>
				<td><input name="mname" class="easyui-validatebox textbox" data-options="required:true,validType:'length[2，4]'"></td>
			</tr>
			
				
			<tr>
				<td>角色:</td>
				<td><input name="mrole" class="easyui-validatebox textbox" data-options="required:true,validType:'length[2,5]'"></td>
			</tr>
			
			<tr>
				<td>密码:</td>
				<td><input name="mpassword" class="easyui-validatebox textbox" data-options="required:true,validType:'length[2,18]'"></td>
			</tr>

			<tr>
				<td colspan="2" align="center" >
					<input name="" type="submit" value="确定"/>
				</td>
			</tr>
		</table>
		</form>
	</div>
	<style scoped="scoped">
		.textbox{
			height:20px;
			margin:0;
			padding:0 2px;
			box-sizing:content-box;
		}
	</style>

</body>
</html>