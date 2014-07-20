<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.service.IBrandInfoService"%>
<%@ page import="com.service.IProductInfoService"%>
<%@ page import="com.util.ContextUtil"%>
<%@ page import="java.util.List"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="com.store.brand.BrandInfo"%>
<%@ page import="com.store.product.ProductInfo"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	ArrayList<ProductInfo> productList = (ArrayList<ProductInfo>) session.getAttribute("ProductList");

	//手机品牌列表
	IBrandInfoService BrandInfoservice = (IBrandInfoService) ContextUtil
			.getContext("BrandInfoService");
	List brandList = BrandInfoservice.findAll();
	if(productList == null || productList.size()==0){
		//手机产品列表
		IProductInfoService ProductInfoservice = (IProductInfoService) ContextUtil
				.getContext("ProductInfoService");
		List list = ProductInfoservice.findAll();
		productList = (ArrayList<ProductInfo>)list;
	}
%>
<html>
	<head>
		<base href="<%=basePath%>">
	</head>
	<body>
		<table width="100%" border="0" cellspacing="0" cellpadding="0">
			<tr>
				<td width="20%" valign="top">
					<table width="100%" border="0" cellspacing="0" cellpadding="0">
						<tr>
							<td height="5" valign="top">
								<img src="images/l_left_line.gif" width="198" height="3">
							</td>
						</tr>
					</table>
					<table width="100%" border="0" cellpadding="0" cellspacing="1"
						bgcolor="#dfdfdf">
						<tr bgcolor="#FFFFFF" class="d_left">
							<td width="10%" height="24" align="center">
								<img src="images/d_left_ar1.gif" width="12" height="12">
							</td>
							<td width="90%">
								【品牌信息】
							</td>
						</tr>
					</table>
					<%
						for (int j = 0; j < brandList.size(); j++) {
					%>
					<form action="BrandDetail" method="post" name="BrandForm">
						<table width="100%" border="0" cellpadding="0" cellspacing="1"
							bgcolor="#dfdfdf">
							<tr bgcolor="#FFFFFF" class="d_left">
								<td width="10%" height="24" align="center">
									<img src="images/d_left_ar1.gif" width="12" height="12">
								</td>
								<td width="90%" onclick="submit()">
									<span onclick="submit()"><%=((BrandInfo) brandList.get(j)).getBrandName()%></span>
									<input type="hidden" name="BrandId"
										value="<%=((BrandInfo) brandList.get(j)).getId()%>" />
								</td>
							</tr>
						</table>
					</form>
					<%
						}
					%>
					<table width="100%" border="0" cellspacing="0" cellpadding="0">
						<tr>
							<td height="5" valign="bottom">
								<img src="images/l_left_line.gif" width="198" height="3">
							</td>
						</tr>
					</table>
					<table width="198" height="7" border="0" align="center"
						cellpadding="0" cellspacing="0">
						<tr>
							<td></td>
						</tr>
					</table>
					<table width="100%" border="0" cellspacing="0" cellpadding="0">
						<tr>
							<td height="35" bgcolor="#0080A3">
								<img src="images/l_left_connectguide.png" width="100%"
									height="35">
							</td>
						</tr>
					</table>
					<table width="98%" border="0" cellpadding="0" cellspacing="1"
						bgcolor="#dddddd">
						<tr>
							<td height="140" bgcolor="#F9F9F9">
								<table width="98%" border="0" align="center" cellpadding="0"
									cellspacing="1" bgcolor="#dddddd">
									<tr>
										<td height="132" bgcolor="#FFFFFF">
											<table width="180" border="0" align="center" cellpadding="0"
												cellspacing="0">
												<tr>
													<td height="57" colspan="2" align="center">
														TEL: 15068808156
														<br />
														E-MAIL: kklo3@qq.com
													</td>
												</tr>
											</table>
										</td>
									</tr>
								</table>
							</td>
						</tr>
					</table>
				</td>
				<td width="80%" valign="top">
					<table width="100%" border="0" align="right" cellpadding="0"
						cellspacing="0">
						<tr>
							<td height="24" colspan="2" background="images/l_center_bg.gif">
								&nbsp;&nbsp;&gt; all &gt;
							</td>
						</tr>
						<tr>
							<td height="5" colspan="2"></td>
						</tr>
						<tr>
							<td width="240" height="4" bgcolor="#7DAFEA"></td>
							<td width="550" bgcolor="#B3B3B3"></td>
						</tr>
						<tr>
							<td height="70">
								<img src="images/l_center_hotproduct.png" width="50%"
									height="55">
							</td>
						</tr>
						<tr>
							<td height="762" colspan="2">
								<table width="100%" border="0" cellspacing="0" cellpadding="0">
									<tr>
										<td height="24" align="center">
											<input type="hidden" name="UserName" id="UserNameID" />
										</td>
									</tr>
									<%
										for (int j = 0; j < productList.size() / 4; j++) {
									%>
									<tr>
										<%
											for (int i = 0; i < 4; i++) {
										%>
										<td width="25%" height="140">
											<form action="Detail" method="post" name="productForm">
												<table width="80%" border="0" align="center" cellpadding="0"
													cellspacing="0">
													<tr>
														<td align="center">
															<img src="images/demo5.jpg" width="113" height="140">
														</td>
													</tr>
													<tr>
														<td height="24" align="center">
															<%=((ProductInfo) productList.get(j * 4 + i))
							.getProductName()%>
															<input type="hidden" name="productId"
																value="<%=((ProductInfo) productList.get(j * 4 + i))
							.getId()%>">
														</td>
													</tr>
													<tr>
														<td height="24" align="center">
															<span class="listmoney"> <font color="red">
																	<b> ￥<%=((ProductInfo) productList.get(j * 4 + i))
							.getPrice()%>.00 </b> </font> </span>
														</td>
													</tr>
													<tr>
														<td height="40" align="center">
															<img src="images/l_center_productmore.gif" width="70"
																height="30" onclick="submit()">
														</td>
													</tr>
													<tr>
														<td height="40" align="center">
															<%=((ProductInfo) productList.get(j * 4 + i))
							.getColor()%>
													</tr>
												</table>
											</form>
										</td>
										<%
											}
										%>
									</tr>
									<tr>
										<td colspan="4">
											&nbsp;
										</td>
									</tr>
									<%
										}
									%>
									<tr>
										<%
											int index = productList.size() - productList.size() % 4;
											for (int i = 0; i < productList.size() % 4; i++) {
										%>
										<td width="25%" height="140">
											<form action="Detail" method="post" name="productForm">
												<table width="80%" border="0" align="center" cellpadding="0"
													cellspacing="0">
													<tr>
														<td align="center">
															<img src="images/demo5.jpg" width="113" height="140">
														</td>
													</tr>
													<tr>
														<td height="24" align="center">
															<%=((ProductInfo) productList.get(index + i))
						.getProductName()%>
															<input type="hidden" name="productId"
																value="<%=((ProductInfo) productList.get(index + i)).getId()%>">
														</td>
													</tr>
													<tr>
														<td height="24" align="center">
															<span class="listmoney"> <font color="red">
																	<b> ￥<%=((ProductInfo) productList.get(index + i)).getPrice()%>.00
																</b> </font> </span>
														</td>
													</tr>
													<tr>
														<td height="40" align="center">
															<img src="images/l_center_productmore.gif" width="70"
																height="30" onclick="submit()">
														</td>
													</tr>
													<tr>
														<td height="40" align="center">
															<%=((ProductInfo) productList.get(index + i)).getColor()%>
													</tr>
												</table>
											</form>
										</td>
										<%
											}
										%>
									</tr>
								</table>
								<!--<table width="100%" border="0" cellspacing="0" cellpadding="0"
									height="50">
									<tr align="center" height="80">
										<td width="30%"></td>
										<td width="20%" align="right">
											<button type="button">
												首页
											</button>
											&nbsp;&nbsp;&nbsp;&nbsp;
											<button type="button">
												&lt;上一页
											</button>
											&nbsp;&nbsp;
										</td>
										<td width="20%" align="left">
											&nbsp;&nbsp;
											<button type="button">
												下一页&gt;
											</button>
											&nbsp;&nbsp;&nbsp;&nbsp;
											<button type="button">
												末页
											</button>
										</td>
										<td width="30%"></td>
									</tr>
								</table>
							-->
							</td>
						</tr>
					</table>
				</td>
			</tr>
		</table>
	</body>
</html>
