<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.service.IUserInfoService"%>
<%@ page import="com.util.ContextUtil"%>
<%@ page import="com.util.DetailInfo"%>
<%@ page import="java.util.List"%>
<%@ page import="com.store.user.UserInfo"%>
<%
	//用户信息列表
	IUserInfoService UserInfoService = (IUserInfoService) ContextUtil
			.getContext("UserInfoService");
	String UserID = (String) session.getAttribute("UserID");
	UserInfo user;
	if (UserID != "" && UserID != null) {
		user = UserInfoService.getUserById(Integer.parseInt(UserID));
	} else {
		user = new UserInfo();
	}
%>
<html>
	<head>
		<title>用户中心</title>
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
								<a href="http://localhost:8080/store/WebPage/UserCenter.jsp">
									订单维护
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
								<a href="http://localhost:8080/store/WebPage/UserEdit.jsp">
									用户资料维护
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
								<a href="http://localhost:8080/store/">
									返回主页
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
					<form action="UserEdit" method="post" name="userForm">
						<table width="650" border="0" align="center" cellpadding="5"
							cellspacing="1">
							<tr bgcolor="#FFFFFF">
								<td width="100" align="center" bgcolor="#E8EFF3">
									用户账号
									<br>
								</td>
								<td width="100">
									<input type="hidden" name="UserId" id="UserIdId" value="<%=user.getId()%>"/>
									<input type="text" name="UserName" id="UserNameId" value="<%=user.getUsername()%>"/>
									*
								</td>
							</tr>
							<tr bgcolor="#FFFFFF">
								<td width="100" align="center" bgcolor="#E8EFF3">
									用户密码
									<br>
								</td>
								<td width="100">
									<input type="text" name="Password" id="PasswordId" value="<%=user.getPassword()%>"/>
									*
								</td>
							</tr>
							<tr bgcolor="#FFFFFF">
								<td width="100" align="center" bgcolor="#E8EFF3">
									手机号码
									<br>
								</td>
								<td width="100">
									<input type="text" name="Phone" id="PhoneId" value="<%=user.getPhone() %>"/>
									*
								</td>
							</tr>
							<tr bgcolor="#FFFFFF">
								<td width="100" align="center" bgcolor="#E8EFF3">
									收货地址
									<br>
								</td>
								<td width="100">
									<input type="text" name="Address" id="AddressId" value="<%=user.getAddress()%>"/>
									*
								</td>
							</tr>
							<tr bgcolor="#FFFFFF">
								<td width="100" align="center" bgcolor="#E8EFF3">
									信用卡
									<br>
								</td>
								<td width="100">
									<input type="text" name="PostCard" id="PostCardId" value="<%=user.getPostcard() %>"/>
								</td>
							</tr>
							<tr bgcolor="#FFFFFF">
								<td width="100" align="center" bgcolor="#E8EFF3">
									真实姓名
									<br>
								</td>
								<td width="100">
									<input type="text" name="Name" id="NameId" value="<%=user.getName() %>"/>
								</td>
							</tr>
							<tr bgcolor="#FFFFFF">
								<td width="100" align="center" bgcolor="#E8EFF3">
									E-Mail
									<br>
								</td>
								<td width="100">
									<input type="text" name="Email" id="EmailId" value="<%=user.getEmail() %>"/>
								</td>
							</tr>
							<tr bgcolor="#FFFFFF">
								<td width="100" align="center">
									<input type="button" id="addUserId" onclick="submit()"
										name="addUser" value="提交修改" />
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
				</td>
			</tr>
		</table>

		<jsp:include page="BackFoot.jsp" />
	</body>
</html>