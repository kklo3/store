<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<html>
	<head>
		<base href="<%=basePath%>">
		<title>登录系统</title>
		<link href="css/login.css" rel="stylesheet" type="text/css" media="all"/>
	</head>

	<body>
		<table width="100%" border="0" align="center" cellpadding="0"
			cellspacing="0">

			<tr>
				<td width="528" background="images/shopcart_bg.gif">
					<img src="images/shopcart2.gif" width="219" height="50">
				</td>
			</tr>

			<tr>
				<td height="30">
					&nbsp;
				</td>
			</tr>

			<tr>
				<td height="30">
					<s:form action="Login" method="POST">
					<table width="598" border="0" align="center" cellpadding="0"
						cellspacing="0">
						<tr>
							<td height="105" colspan="3" bgcolor="#FFFFFF">
								<img src="images/login_1.gif" width="598" height="105">
							</td>
						</tr>

						<tr>
							<td height="120" colspan="3" background="images/login_bg.gif"
								bgcolor="#FFFFFF">
									<table width="400" border="0" align="center" cellpadding="0"
										cellspacing="0">
										<tr>
											<td width="80" height="30">
												${requestScope.message}
											</td>
										</tr>
										<tr>
											<s:textfield name="ManagerName" label="用户名" cssStyle="height:20px"/>
											<s:password name="ManagerPassword" size="21" label="密码" cssStyle="height:20px"/>
											<s:submit value="提交" type="image" src="images/login_4.gif"
												cssStyle="height:40px"/>
										</tr>
										<tr>
										</tr>
									</table>
							</td>
						</tr>
						<tr>
							<td width="115" height="105" bgcolor="#FFFFFF">
								<img src="images/login3.gif" width="115" height="123">
							</td>
							<!-- 立即注册 -->
							<td width="230" bgcolor="#FFFFFF">
								<img src="images/login4.gif" width="230" height="123">
							</td>
							<!-- 找回密码 -->
							<td width="253" bgcolor="#FFFFFF">
								<img src="images/login5.gif" width="253" height="123">
							</td>
						</tr>

					</table>
					</s:form>
				</td>
			</tr>
		</table>
	</body>
</html>