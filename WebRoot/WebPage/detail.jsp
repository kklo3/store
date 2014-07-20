<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.service.IBrandInfoService"%>
<%@ page import="com.service.IProductInfoService"%>
<%@ page import="com.util.ContextUtil"%>
<%@ page import="java.util.List"%>
<%@ page import="com.store.brand.BrandInfo"%>
<%@ page import="com.store.product.ProductInfo"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%
	String productID = (String) request.getAttribute("productId");
	if (productID == null)
		productID = "0";
	//手机产品列表
	IProductInfoService ProductInfoservice = (IProductInfoService) ContextUtil
			.getContext("ProductInfoService");
	ProductInfo product = ProductInfoservice.getProductInfoById(Integer
			.parseInt(productID));

	//手机品牌列表
	IBrandInfoService BrandInfoservice = (IBrandInfoService) ContextUtil
			.getContext("BrandInfoService");
	BrandInfo brand = BrandInfoservice.getBrandInfoById(product
			.getBrandId());
%>
<html>
	<head>
		<base href="<%=basePath%>">
	</head>
	<script src="js/jquery.js" type="text/javascript"></script>
	<script type="text/javascript">
	function pay() {
		alert("该服务暂未开通");
	}
	$(document).ready(function(){
	$("#AddToCart").click(function(){
			var ProductName = "<%=product.getProductName()%>";
			$.ajax({
						url : '/store/CartsAction',
						data : {ProductName:ProductName},
						dataType : 'json',
						type : 'post',
						success : function(data) {
							alert("添加成功");
						},
						error : function() {
							alert("出现异常");
						}
					});
		});
	});
	</script>
	<body>
		<jsp:include page="ListHead.jsp" />

		<table width="100%" border="0" cellspacing="0" cellpadding="0">
			<tr>
				<td width="80%" valign="top">
					<table width="100%" border="0" align="right" cellpadding="0"
						cellspacing="0">
						<tr>
							<td height="762" colspan="2">
								<table width="100%" border="0" align="right" cellpadding="0"
									cellspacing="0">
									<tr>
										<td height="5" colspan="2">
										</td>
									</tr>
									<tr>
										<td height="24" colspan="2"
											background="images/l_center_bg.gif">
											&nbsp;&nbsp;&gt; Home &gt;<%=brand.getBrandName()%>&gt;
											<%=product.getProductName()%>
										</td>
									</tr>
									<tr>
										<td height="5" colspan="2"></td>
									</tr>
									<tr>
										<td width="330" height="4" bgcolor="#BDDA8D"></td>
										<td width="360" bgcolor="#B3B3B3"></td>
									</tr>
									<tr>
										<td height="70" colspan="2">
											<table width="90%" border="0" cellspacing="0" cellpadding="0">
												<tr>
													<td width="40%" height="330" align="center" valign="middle">
														<table width="320" border="0" cellspacing="0"
															cellpadding="0">
															<tr>
																<!-- 手机图片 -->
																<td align="center">
																	<img src="images/demo6.jpg" width="307" height="241">
																</td>
															</tr>
															<tr>
																<!-- 放大镜 -->
																<td height="40" align="center">
																	<img src="images/i_center_more.gif" width="39"
																		height="29">
																</td>
															</tr>
														</table>
													</td>
													<td width="50%" valign="top">
														<table width="70%" border="0" align="center"
															cellpadding="0" cellspacing="0">
															<tr>
																<td height="50">
																	<span class="i_title1"> <font size="6"> <%=product.getProductName()%>
																	</font> </span>
																</td>
															</tr>
															<tr>
																<td height="1" bgcolor="#e7e7e7"></td>
															</tr>
															<tr>
																<td height="50">
																	<table width="100%" border="0" align="center"
																		cellpadding="5" cellspacing="0">
																		<tr>
																			<td height="150">
																				<font color="blue" size="6"
																					style="font-weight: bold"> 售价： </font>
																				<font color="red" size="6" style="font-weight: bold">
																					<%=product.getPrice()%>.00 </font>
																			</td>
																		</tr>
																	</table>
																</td>
															</tr>
															<tr>
																<td height="1" bgcolor="#e7e7e7"></td>
															</tr>
															<tr>
																<td height="15"></td>
															</tr>
															<tr>
																<td height="1" bgcolor="#e7e7e7"></td>
															</tr>
															<tr>
																<td height="90">
																	<table width="100%" height="80" border="0"
																		align="center" cellpadding="5" cellspacing="0">
																		<tr>
																			<td height="26" valign="top" bgcolor="#EAEBDE">
																				厂商品牌：
																				<%=brand.getBrandName()%>
																			</td>
																		</tr>
																	</table>
																</td>
															</tr>
															<tr>
																<td height="1" bgcolor="#e7e7e7"></td>
															</tr>
															<tr>
																<td height="30" align="center">
																	<img src="images/i_center_shopcart.gif" width="152"
																		height="70" id="AddToCart">
																	<img src="images/i_center_payfor.gif" width="156"
																		height="71" onclick="pay()">
																</td>
															</tr>
														</table>
													</td>
												</tr>
											</table>
										</td>
									</tr>

									<tr>
										<td height="15" colspan="2"></td>
									</tr>
									<tr>
										<td width="330" height="4" bgcolor="#EA7DB1"></td>
										<td width="360" bgcolor="#B3B3B3"></td>
									</tr>
									<tr>
										<td height="80" colspan="2">
											<img src="images/i_center_detail.gif" width="196" height="68">
										</td>
									</tr>
									<tr>
										<td height="1" colspan="2" bgcolor="#EFEFEF"></td>
									</tr>
									<tr valign="top">
										<td height="300" colspan="2">
											<table width="690" border="0" cellspacing="0" cellpadding="0">
												<tr>
													<td width="460">
														<table width="430" border="0" align="center"
															cellpadding="0" cellspacing="0">
															<tr>
																<td>
																	<span class="i_txt"><br> 简介 </span>
																</td>
															</tr>
														</table>
													</td>
													<td width="230" valign="top">
														<table width="220" height="5" border="0" align="center"
															cellpadding="0" cellspacing="0">
															<tr>
																<td></td>
															</tr>
														</table>
														<br>
														<br>
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
			</tr>
		</table>
		<jsp:include page="ListFoot.jsp" />
	</body>
</html>
