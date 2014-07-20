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
		<title>新增产品页面</title>
		<script type="text/javascript">
	function GoBack() {
		window.location.href = "http://localhost:8080/store/WebPage/productManagement.jsp";
	}
</script>
	</head>

	<body>
		<br>
		<form action="NewProduct">
			<table width="650" border="0" align="center" cellpadding="5"
				cellspacing="1">
				<tr bgcolor="#FFFFFF">
					<td width="100" align="center" bgcolor="#E8EFF3">
						产品名称
						<br>
					</td>
					<td width="100">
						<input type="text" name="ProductName" />*
					</td>
				</tr>
				<tr bgcolor="#FFFFFF">
					<td width="100" align="center" bgcolor="#E8EFF3">
						价格
						<br>
					</td>
					<td width="100">
						<input type="text" name="Price" />
					</td>
				</tr>
				<tr bgcolor="#FFFFFF">
					<td width="100" align="center" bgcolor="#E8EFF3">
						网络模式
						<br>
					</td>
					<td width="100">
						<input type="text" name="GsmEdit" />
					</td>
				</tr>
				<tr bgcolor="#FFFFFF">
					<td width="100" align="center" bgcolor="#E8EFF3">
						机型颜色
						<br>
					</td>
					<td width="100">
						<input type="text" name="Color" />
					</td>
				</tr>
				<tr bgcolor="#FFFFFF">
					<td width="100" align="center" bgcolor="#E8EFF3">
						厂商品牌
						<br>
					</td>
					<td width="100">
						<input type="text" name="BrandId" />
					</td>
				</tr>
				<tr bgcolor="#FFFFFF">
					<td width="100" align="center" bgcolor="#E8EFF3">
						备注
						<br>
					</td>
					<td width="100">
						<input type="text" name="Memo" />
					</td>
				</tr>
				<s:submit value="提交" align="center">
					<input type="button" id="addProduct" onclick="GoBack()" name="add"
						value="返回" />
				</s:submit>
			</table>
		</form>
		<br>
	</body>
</html>
