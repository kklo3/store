<%@ page contentType="text/html; charset=UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	String UserName = (String)request.getAttribute("UserNameOut");
%>
<html>
	<head>
		<base href="<%=basePath%>">
		<title>修改用户信息页面</title>
		<script src="js/jquery.js" type="text/javascript"></script>
		<script type="text/javascript">
			$(document).ready(function(){
				$("#UserNameId").blur(function(){
					if($(this).val()==""){
						alert("请输入用户账号");
						$(this).focus();
					}
					if($(this).val().length>20){
						alert("用户账号 长度不得超过20位");
						$(this).focus();
					}
				});
				$("#PasswordId").blur(function(){
					if($(this).val()==""){
						alert("请输入 密码");
						$(this).focus();
					}
					if($(this).val().length>20){
						alert("密码 长度不得超过20位");
						$(this).focus();
					}
				});
				$("#PhoneId").blur(function(){
					if($(this).val()==""){
						alert("请输入 手机号码");
						$(this).focus();
					}
					if($(this).val().length>11){
						alert("手机号码 长度不得超过11位");
						$(this).focus();
					}
				});
				$("#AddressId").blur(function(){
					if($(this).val()==""){
						alert("请输入 收货地址");
						$(this).focus();
					}
					if($(this).val().length>20){
						alert("收货地址 长度不得超过20位");
						$(this).focus();
					}
				});
				$("#PostCardId").focus().blur(function(){
					if($(this).val().length>20){
						alert("信用卡号 长度不得超过20位");
						$(this).focus();
					}
				});
				$("#NameId").focus().blur(function(){
					if($(this).val().length>20){
						alert("姓名 长度不得超过20位");
						$(this).focus();
					}
				});
				$("#EmailId").focus().blur(function(){
					if($(this).val().length>50){
						alert("E-mail 长度不得超过50位");
						$(this).focus();
					}
				});
			});
			function GoBack() {
				window.location.href = "http://localhost:8080/store/WebPage/userManagement.jsp";
			}
		</script>
	</head>

	<body>
		<br>
		<form action="UpdateUser" method="post" name="userForm">
			<table width="650" border="0" align="center" cellpadding="5"
				cellspacing="1">
				<tr bgcolor="#FFFFFF">
					<td width="100" align="center" bgcolor="#E8EFF3">
						用户账号
						<br>
					</td>
					<td width="100">
						<input type="text" name="UserName" id="UserNameId" value="${UserNameOut}"/>
						*
					</td>
				</tr>
				<tr bgcolor="#FFFFFF">
					<td width="100" align="center" bgcolor="#E8EFF3">
						用户密码
						<br>
					</td>
					<td width="100">
						<input type="text" name="Password" id="PasswordId"/>
						*
					</td>
				</tr>
				<tr bgcolor="#FFFFFF">
					<td width="100" align="center" bgcolor="#E8EFF3">
						手机号码
						<br>
					</td>
					<td width="100">
						<input type="text" name="Phone" id="PhoneId"/>
						*
					</td>
				</tr>
				<tr bgcolor="#FFFFFF">
					<td width="100" align="center" bgcolor="#E8EFF3">
						收货地址
						<br>
					</td>
					<td width="100">
						<input type="text" name="Address" id="AddressId"/>
						*
					</td>
				</tr>
				<tr bgcolor="#FFFFFF">
					<td width="100" align="center" bgcolor="#E8EFF3">
						信用卡
						<br>
					</td>
					<td width="100">
						<input type="text" name="PostCard" id="PostCardId"/>
					</td>
				</tr>
				<tr bgcolor="#FFFFFF">
					<td width="100" align="center" bgcolor="#E8EFF3">
						真实姓名
						<br>
					</td>
					<td width="100">
						<input type="text" name="Name" id="NameId"/>
					</td>
				</tr>
				<tr bgcolor="#FFFFFF">
					<td width="100" align="center" bgcolor="#E8EFF3">
						E-Mail
						<br>
					</td>
					<td width="100">
						<input type="text" name="Email" id="EmailId"/>
					</td>
				</tr>
				<tr bgcolor="#FFFFFF">
					<td width="100" align="center">
						<input type="button" id="addUserId" onclick="submit()"
							name="addUser" value="提交" />
					</td>
					<td width="100">
						<input type="button" id="backBtnId" onclick="GoBack()"
							name="backBtn" value="返回" />
					</td>
				</tr>
				<tr bgcolor="#FFFFFF">
					<td width="100" align="center">
						${message}
					</td>
				</tr>
				</submit>
			</table>
		</form>
		<br>
	</body>
</html>
