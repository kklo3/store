<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.service.IUserInfoService"%>
<%@ page import="com.util.ContextUtil"%>
<%@ page import="java.util.List"%>
<%@ page import="com.store.user.UserInfo"%>
<%
	//用户信息列表
	IUserInfoService UserInfoservice = (IUserInfoService) ContextUtil
			.getContext("UserInfoService");
	List userList = UserInfoservice.findAll();
%>
<html>
	<head>
		<title>后台管理系统</title>
		<script src="js/jquery.js" type="text/javascript"></script>
		<script type="text/javascript">
			function UserItemRemove(r) {
				var UI = r.name;
				$.ajax({
					url : '/store/UserDelAction',
					data : {
						UserId : UI
					},
					dataType : 'json',
					type : 'post',
					success : function(data) {
						alert("删除成功");
					},
					error : function() {
						alert("出现异常");
					}
				});
				history.go(-0);
			}
			function NewUser() {
				window.location.href = "http://localhost:8080/store/WebPage/NewUser.jsp";
			}
		</script>
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
								<a
									href="http://localhost:8080/store/WebPage/orderManagement.jsp">
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
								<a
									href="http://localhost:8080/store/WebPage/productManagement.jsp">
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
								<a href="http://localhost:8080/store/WebPage/login.jsp"> <img
										src="../images/users_zhuxiao.gif" width="182" height="56">
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
					<table width="650" border="0" align="center" cellpadding="5"
						cellspacing="1" bgcolor="#BAC9D1">
						<tr bgcolor="#FFFFFF">
							<td width="100" align="center" bgcolor="#E8EFF3">
								<input type="button" id="addUser" onclick="NewUser()" name="add"
									value="新增用户" />
							</td>
						</tr>
					</table>
					<br>
					<%
						for (int i = 0; i < userList.size(); i++) {
					%>
					<form action="EditUser" method="post" name="userForm">
					<table width="650" border="0" align="center" cellpadding="5"
						cellspacing="1" bgcolor="#BAC9D1">
						<tr bgcolor="#FFFFFF">
							<td width="100" align="center" bgcolor="#E8EFF3">
								用户编号
							</td>
							<td width="120">
								<%=((UserInfo) userList.get(i)).getId()%>
							</td>
							<td width="100" align="center" bgcolor="#E8EFF3">
								用户名
								<br>
							</td>
							<td width="100">
								<%=((UserInfo) userList.get(i)).getUsername()%>
							</td>
							<td width="100" align="center" bgcolor="#E8EFF3">
								E-Mail
							</td>
							<td width="130">
								<%=((UserInfo) userList.get(i)).getEmail()%>
							</td>
						</tr>
						<tr bgcolor="#FFFFFF">
							<td align="center" bgcolor="#E8EFF3">
								用户姓名
							</td>
							<td bgcolor="#FFFFFF" colspan="2">
								<%=((UserInfo) userList.get(i)).getName()%>
							</td>
							<td colspan="3" align="center">
								<%=((UserInfo) userList.get(i)).getAddress()%>
							</td>
						</tr>
						<tr bgcolor="#FFFFFF">
							<td width="100" align="center" bgcolor="#E8EFF3">
								维护
								<br>
							</td>
							<td width="100">
								<input type="button" id="cartItemRemove"
									onclick="javascript:window.UserItemRemove(this);"
									name="<%=((UserInfo) userList.get(i)).getId()%>"
									value="删除" />
							</td>
							<td width="100" align="center" bgcolor="#E8EFF3">
								手机号码
							</td>
							<td width="120">
								<%=((UserInfo) userList.get(i)).getPhone()%>
							</td>
							<td width="100" align="center" bgcolor="#E8EFF3">
								信用卡号
							</td>
							<td width="130">
								<%=((UserInfo) userList.get(i)).getPostcard()%>
							</td>
						</tr>
					</table>
					</form>
					<br>
					<%
						}
					%>
				</td>
			</tr>
		</table>

		<jsp:include page="BackFoot.jsp" />
	</body>
</html>
