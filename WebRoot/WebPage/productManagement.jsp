<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.service.IProductInfoService"%>
<%@ page import="com.util.ContextUtil"%>
<%@ page import="com.util.DetailInfo"%>
<%@ page import="java.util.List"%>
<%@ page import="com.store.product.ProductInfo"%>
<%
	//用户信息列表
	IProductInfoService ProductInfoservice = (IProductInfoService) ContextUtil
			.getContext("ProductInfoService");
	List productList = ProductInfoservice.findAll();
%>
<html>
	<head>
		<title>后台管理系统</title>
		<script type="text/javascript">
			function NewProduct() {
				window.location.href = "http://localhost:8080/store/WebPage/NewProduct.jsp";
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
								<input type="button" id="addProduct"
									onclick="NewProduct()" name="add"
									value="新增产品" />
							</td>
						</tr>
					</table>
					<br>
					<%
						for (int i = 0; i < productList.size(); i++) {
					%>
					<table width="650" border="0" align="center" cellpadding="5"
						cellspacing="1" bgcolor="#BAC9D1">
						<tr bgcolor="#FFFFFF">
							<td width="100" align="center" bgcolor="#E8EFF3">
								产品编号
								<br>
							</td>
							<td width="100">
								<%=((ProductInfo) productList.get(i)).getId()%>
							</td>
							<td width="100" align="center" bgcolor="#E8EFF3">
								产品名称
							</td>
							<td width="120">
								<%=((ProductInfo) productList.get(i)).getProductName()%>
							</td>
							<td width="100" align="center" bgcolor="#E8EFF3">
								价格
							</td>
							<td width="130">
								<%=((ProductInfo) productList.get(i)).getPrice()%>
							</td>
						</tr>
						<tr bgcolor="#FFFFFF">
							<td align="center" bgcolor="#E8EFF3">
								网络模式
							</td>
							<td bgcolor="#FFFFFF">
								<%=DetailInfo.getGsmEditName(((ProductInfo) productList.get(i)).getGsmEdit())%>
							</td>
							<td width="100" align="center" bgcolor="#E8EFF3">
								机型颜色
								<br>
							</td>
							<td width="100">
								<%=((ProductInfo) productList.get(i)).getColor()%>
							</td>
							<td width="100" align="center" bgcolor="#E8EFF3">
								厂商品牌
								<br>
							</td>
							<td width="100">
								<%= DetailInfo.getBrandNameById(((ProductInfo) productList.get(i)).getBrandId())%>
							</td>
						</tr>
						<tr bgcolor="#FFFFFF">
							<td width="100" align="center" bgcolor="#E8EFF3">
								维护
								<br>
							</td>
							<td width="100" colspan="5">
								<input type="button" id="cartItemRemove"
									onclick="javascript:window.UserItemRemove(this);"
									name="<%=((ProductInfo) productList.get(i)).getId()%>"
									value="删除" />
								<input type="button" id="cartItemRemove"
									onclick="javascript:window.UserItemEdit(this);"
									name="<%=((ProductInfo) productList.get(i)).getId()%>"
									value="修改" />
							</td>
						</tr>
					</table>
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
