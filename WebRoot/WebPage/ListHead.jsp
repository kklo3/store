<%@ page contentType="text/html; charset=UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	String UserID = (String) session.getAttribute("UserID");
%>

<html>
	<head>
		<base href="<%=basePath%>">
	</head>
	<script type="text/javascript">
	function Index() {
		window.location.href="http://localhost:8080/store/BrandDetail?BrandId=-1";
	}
	function GoCarts() {
		window.open("http://localhost:8080/store/WebPage/Carts.jsp");
	}
	function UserApply(){
		window.open("http://localhost:8080/store/WebPage/UserApply.jsp");
	}
	function GoUserCenter(){
		if("<%=UserID%>"!="null"){
		window.open("http://localhost:8080/store/WebPage/UserCenter.jsp");
		}else{
			alert("用户尚未登录！");
			return;
		}
	}
</script>
	<body>
		<table width="100%" border="0" cellspacing="0" cellpadding="0">
			<tr>
				<td height="5" bgcolor="#363636"></td>
			</tr>
			<tr>
				<td height="80">
					<table width="100%" border="0" cellspacing="0" cellpadding="0">
						<tr>
							<td width="20%" height="80" rowspan="2">
								<img src="images/logo.jpg" width="200" height="60">
							</td>
						</tr>
						<tr>
							<td height="50" align="right">
								<img src="images/index.jpg" width="132" height="47" onclick="Index()">
								<img src="images/UserInfo.jpg" width="132" height="47" onclick="GoUserCenter()">
								<img src="images/UserApply.jpg" width="132" height="47" onclick="UserApply()">
								<img src="images/shopcart.jpg" width="136" height="47"
									onclick="GoCarts()">
							</td>
						</tr>
					</table>
				</td>
			</tr>
			<tr>
				<td height="1" bgcolor="#dddddd"></td>
			</tr>
			<tr>
				<td height="3" bgcolor="#f5f5f5"></td>
			</tr>

		</table>
	</body>
</html>
