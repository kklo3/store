<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="com.util.DetailInfo"%>
<%@ page import="com.store.product.ProductInfo"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	ArrayList<ProductInfo> ordersList = (ArrayList<ProductInfo>) session
			.getAttribute("product");
%>
<html>
	<head>
		<base href="<%=basePath%>">
		<title>购物车模块</title>
		<link href="css/Carts.css" rel="stylesheet" type="text/css"
			media="all" />
		<script src="js/jquery.js" type="text/javascript"></script>
		<script type="text/javascript">
			function cartItemRemove(r) {
				var PN = r.name;
				$.ajax({
					url : '/store/CartsDelAction',
					data : {
						ProductName : PN
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
			}
		</script>
	</head>

	<body>
		<form action="orderAction" method="post" name="orderForm">
			<table width="700" border="0" align="center" cellpadding="0"
				cellspacing="0">
				<tr>
					<td colspan="11" background="images/shopcart_bg2.gif">
						<img src="images/shopcart.gif" width="219" height="50">
					</td>
				</tr>
				<tr>
					<td height="30" colspan="11">
						<img src="images/shopcart_2.gif" width="400" height="11">
					</td>
				</tr>
				<tr>
					<td height="15" colspan="11">
						&nbsp;
					</td>
				</tr>
				<tr>
					<td height="5" colspan="11" bgcolor="#efefef"></td>
				</tr>
				<tr>
					<td width="200" height="30" align="center" bgcolor="#FFFFFF"
						class="shopcart">
						手机名称
					</td>
					<td width="7" valign="top">
						<img src="images/shopcart_line.gif" width="7" height="29">
					</td>
					<td width="80" align="center" bgcolor="#FFFFFF" class="shopcart">
						手机颜色
					</td>
					<td width="7" align="center" valign="top">
						<img src="images/shopcart_line.gif" width="7" height="29">
					</td>
					<td width="120" align="center" bgcolor="#FFFFFF" class="shopcart">
						品牌名称
					</td>
					<td width="7" align="center" valign="top">
						<img src="images/shopcart_line.gif" width="7" height="29">
					</td>
					<td width="100" align="center" bgcolor="#FFFFFF" class="shopcart">
						网络制式
					</td>
					<td width="7" align="center" valign="top" class="shopcart">
						<img src="images/shopcart_line.gif" width="7" height="29">
					</td>
					<td width="100" align="center" bgcolor="#FFFFFF" class="shopcart">
						删除
					</td>
					<td width="7" align="center" valign="top" class="shopcart">
						<img src="images/shopcart_line.gif" width="7" height="29">
					</td>
					<td width="100" align="center" bgcolor="#FFFFFF" class="shopcart">
						单价
					</td>
				</tr>
				<tr>
					<td height="1" colspan="11" bgcolor="#efefef"></td>
				</tr>
				<%
					long totalPrice = 0;
					if (ordersList != null){
						for (int i = 0; i < ordersList.size(); i++) {
						totalPrice+=ordersList.get(i).getPrice();
						%>
						<tr align="center" bgcolor="#FFFFFF">
							<td height="30" colspan="2"><%=ordersList.get(i).getProductName()%></td>
							<td height="30" colspan="2"><%=ordersList.get(i).getColor()%></td>
							<td height="30" colspan="2"><%=DetailInfo.getBrandNameById(ordersList.get(i).getBrandId())%></td>
							<td height="30" colspan="2"><%=DetailInfo.getGsmEditName(ordersList.get(i).getGsmEdit())%></td>
							<td height="30" colspan="1">
								<input type="button" id="cartItemRemove"
									onclick="javascript:window.cartItemRemove(this);"
									name="<%=(ordersList.get(i).getProductName()).toString()%>"
									value="删除" />
							</td>
							<td height="30" colspan="2"><%=ordersList.get(i).getPrice()%>.00
							</td>
						</tr>
						<tr>
							<td height="1" colspan="11" bgcolor="#efefef"></td>
						</tr>
						<%
						}
					}
				%>
				<tr>
					<td height="5" colspan="11" bgcolor="#efefef"></td>
				</tr>
				<tr align="center">
					<td height="40" colspan="5" align="left">
						总计：
					</td>
					<td height="40" colspan="4" align="center">
					</td>
					<td height="40" colspan="2" align="center">
						<font color="red" style="font-weight: bold"> <%=totalPrice%>.00 </font>
					</td>
				</tr>
				<tr align="right">
					<td height="40" colspan="11">
						<input type="button" value="更新购物车"
							onclick="javascript:window.top.location.reload()"/>
						&nbsp;&nbsp;
						<input type="submit" value="结算"/>
					</td>
				</tr>
			</table>
		</form>
	</body>
</html>