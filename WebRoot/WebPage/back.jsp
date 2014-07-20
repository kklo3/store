<%@ page contentType="text/html; charset=UTF-8"%>
<html>
	<head>
		<title>后台管理系统</title>
	</head>

	<body>
		<jsp:include page="BackHead.jsp" />
		<table width="900" border="0" cellspacing="0" cellpadding="0">
			<tr>
				<td width="200" valign="top" bgcolor="#E8EFF3">
					<table width="180" border="0" align="center" cellpadding="0"
						cellspacing="0">
						<tr>
							<td width="60" height="60" align="center">
								<a href="http://localhost:8080/store/WebPage/orderManagement.jsp">
									<img src="../images/orderManage.jpg" width="182" height="60">
								</a>
							</td>
						</tr>
						<tr>
							<td height="1" bgcolor="#ffffff"></td>
						</tr>
						<tr>
							<td height="1" bgcolor="#BAC9D1"></td>
						</tr>
						<tr>
							<td width="60" height="60" align="center">
								<a href="http://localhost:8080/store/WebPage/userManagement.jsp">
									<img src="../images/userManage.jpg" width="182" height="56">
								</a>
							</td>
						</tr>
						<tr>
							<td height="1" bgcolor="#ffffff"></td>
						</tr>
						<tr>
							<td height="1" bgcolor="#BAC9D1"></td>
						</tr>
						<tr>
							<td width="60" height="60" align="center">
								<a href="http://localhost:8080/store/WebPage/productManagement.jsp">
									<img src="../images/productManage.jpg" width="182" height="57">
								</a>
							</td>
						</tr>
						<tr>
							<td height="1" bgcolor="#ffffff"></td>
						</tr>
						<tr>
							<td height="1" bgcolor="#BAC9D1"></td>
						</tr>
						<tr>
							<td width="60" height="60" align="center">
								<a href="http://localhost:8080/store/WebPage/login.jsp">
									<img src="../images/users_zhuxiao.gif" width="182" height="56">
								</a>
							</td>
						</tr>
						<tr>
							<td height="1" bgcolor="#ffffff"></td>
						</tr>
						<tr>
							<td height="1" bgcolor="#BAC9D1"></td>
						</tr>
					</table>
				</td>
				<td width="700" height="400" valign="top">
					<br>
						<h2>欢迎回来！</h2>
							<h3>&nbsp;&nbsp;&nbsp;&nbsp;管理员 ${message}</h3>
					<br>
				</td>
			</tr>
		</table>
		<jsp:include page="BackFoot.jsp" />
	</body>
</html>
