<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.service.IOrderInfoService"%>
<%@ page import="com.util.ContextUtil"%>
<%@ page import="com.util.DetailInfo"%>
<%@ page import="java.util.List"%>
<%@ page import="com.store.order.OrderInfo"%>
<%
	//用户信息列表
	IOrderInfoService OrderInfoservice = (IOrderInfoService) ContextUtil
			.getContext("OrderInfoService");
	String UserID = (String) session.getAttribute("UserID");
	List orderList;
	if(UserID!="" && UserID!=null){
		orderList = OrderInfoservice.getOrderByUserId(Integer.parseInt(UserID));
	}
	else{
		orderList = OrderInfoservice.findAll();
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
					<br>
					<%
							for(int i =0;i<orderList.size();i++){
						%>
					<table width="650" border="0" align="center" cellpadding="5"
						cellspacing="1" bgcolor="#BAC9D1">
						<tr bgcolor="#FFFFFF">
							<td width="100" align="center" bgcolor="#E8EFF3">
								订单号
								<br>
							</td>
							<td width="100">
								<%=((OrderInfo) orderList.get(i)).getId()%>
							</td>
							<td width="100" align="center" bgcolor="#E8EFF3">
								日期
							</td>
							<td width="120">
								<%=((OrderInfo) orderList.get(i)).getDoneDate()%>
							</td>
							<td width="100" align="center" bgcolor="#E8EFF3">
								价格
							</td>
							<td width="130">
								<%=DetailInfo.getPriceById(((OrderInfo) orderList.get(i)).getProductId())%>
							</td>
						</tr>
						<tr bgcolor="#FFFFFF">
							<td align="center" bgcolor="#E8EFF3">
								用户名
							</td>
							<td bgcolor="#FFFFFF">
								<%=DetailInfo.getUserNameById(((OrderInfo) orderList.get(i)).getUserId())%>
							</td>
							<td colspan="4" align="center">
								<%=DetailInfo.getAddressByUserId(((OrderInfo) orderList.get(i)).getUserId())%>
							</td>
						</tr>
						<tr bgcolor="#FFFFFF">
							<td align="center" bgcolor="#E8EFF3">
								产品名称
							</td>
							<td colspan="5" bgcolor="#FFFFFF">
								<%=DetailInfo.getProductNameById(((OrderInfo) orderList.get(i)).getProductId())%>
							</td>
						</tr>
					</table>
					<br>
					<%}%>
				</td>
			</tr>
		</table>

		<jsp:include page="BackFoot.jsp" />
	</body>
</html>